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
            this.meio.gerarComentario(obra.getTitulo());
            this.meio.gerarNegrito(obra.getTitulo());
            this.meio.gerarItalico("conteudo", "conteudo");
        }
        return conteudo;
    }

    @Override
    public String gerarFooter() {
        return meio.gerarFooter();
    }
     
}
