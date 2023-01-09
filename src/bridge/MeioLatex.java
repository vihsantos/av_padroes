package bridge;

public class MeioLatex implements Meio {

    @Override
    public String gerarHeader() {
        return "";
    }

    @Override
    public String gerarComentario(String value) {
        return "% "+ value + "\n";
    }

    @Override
    public String gerarNegrito(String value) {
        return "\\textbf{" + value + "} \n";
    }

    @Override
    public String gerarItalico(String valor1, String valor2) {
        return "\\emph{" + valor1 +" "+  valor2 + "}\n";
    }

    @Override
    public String gerarComplementos(String label, String valor) {
        return label + ": " + valor + "\n";
    }

    @Override
    public String gerarFooter() {
        return "";
    }


    
}
