package template_method;

import java.util.List;

import bridge.Meio;
import modelos.Obra;
import visitor.StringExportVisitor;

public class RelatorioCompleto extends TemplateRelatorio{

    public RelatorioCompleto(List<Obra> obras, Meio meio) {
        super(obras, meio);
    }

    @Override
    public String gerarHeader() {
        return this.meio.gerarHeader();
    }

    @Override
    public String gerarConteudo() {
        String conteudo = "";
        
        StringExportVisitor visitor = new StringExportVisitor();
        
        for (Obra obra : this.obras) {
        	obra.accept(visitor);
        	
            conteudo += this.meio.gerarComentario(obra.getTitulo())+
            this.meio.gerarNegrito(obra.getTitulo())+
            this.meio.gerarItalico(obra.getAutor(),obra.getAno().toString())+
            this.meio.gerarComplementos(visitor.getString()) + "\n";
        }
        return conteudo;
    }

    @Override
    public String gerarFooter() {
        return this.meio.gerarFooter();
    }
    
}
