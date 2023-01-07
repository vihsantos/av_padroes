package template_method;

import java.util.List;

import bridge.Meio;
import modelos.Obra;

public abstract class TemplateRelatorio {
    List<Obra> obras;
    Meio meio;

    public TemplateRelatorio(List<Obra> obras, Meio meio) {
        this.obras = obras;
        this.meio = meio;
    }

    public void gerarRelatorio(){

        String relatorio = "";
        relatorio += gerarHeader();
        relatorio += gerarConteudo();
        relatorio += gerarFooter();
        System.out.println(relatorio);
    
    }

    public abstract String gerarHeader();
    public abstract String gerarConteudo();
    public abstract String gerarFooter();

}
