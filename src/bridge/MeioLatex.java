package bridge;

public class MeioLatex implements Meio {

    @Override
    public String gerarHeader() {
        return "";
    }

    @Override
    public String gerarComentario(String value) {
        return "% "+ value;
    }

    @Override
    public String gerarNegrito(String value) {
        return "\\textbf{" + value + "}";
    }

    @Override
    public String gerarItalico(String[] values) {
        return "\\emph{" + values[0] +" "+  values[1] + "}";
    }

    @Override
    public String gerarFooter() {
        return "";
    }
    
}
