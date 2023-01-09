package template_method;

import java.util.List;

import bridge.Meio;
import modelos.Obra;

public class RelatorioResumido extends TemplateRelatorio{

    public RelatorioResumido(List<Obra> obras, Meio meio) {
        super(obras, meio);
    }

    @Override
    public String gerarHeader() {
        return meio.gerarHeader();
    }

    @Override
    public String gerarConteudo() {
        String conteudo = "";
        for (Obra obra : this.obras) {
            conteudo += this.meio.gerarComentario(obra.getTitulo()) +
            this.meio.gerarNegrito(obra.getTitulo())+
            this.meio.gerarItalico(obra.getAutor(),obra.getAno().toString()) + "\n";
        }
        return conteudo;
    }

    @Override
    public String gerarFooter() {
        return meio.gerarFooter();
    }
     
}
