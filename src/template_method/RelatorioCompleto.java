package template_method;

import java.util.List;

import bridge.Meio;
import modelos.Obra;

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
        for (Obra obra : this.obras) {
            this.meio.gerarComentario(obra.getTitulo());
            this.meio.gerarNegrito(obra.getTitulo());
            this.meio.gerarItalico(new String[]{"", ""});
        }
        return conteudo;
    }

    @Override
    public String gerarFooter() {
        return this.meio.gerarFooter();
    }
    
}
