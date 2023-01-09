package bridge;

public class MeioHtml implements Meio{

    @Override
    public String gerarHeader() {
        return "<HTML>\n <HEAD></HEAD>\n <BODY>\n";
    }

    @Override
    public String gerarComentario(String value) {
        return "<!-- " + value + "-->\n";
    }

    @Override
    public String gerarNegrito(String value) {
        return "<bold>" + value + "</bold>\n";
    }

    @Override
    public String gerarItalico(String valor1, String valor2) {
        return "<italic>" + valor1 + " " + valor2 + "</italic>\n";
    }

    @Override
    public String gerarComplementos(String label, String valor) {
        return label + ": " + valor + "\n";
    }
        
    @Override
    public String gerarFooter() {
        return "</BODY>";
    }

    

}