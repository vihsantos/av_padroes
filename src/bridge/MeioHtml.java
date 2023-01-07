package bridge;

class MeioHtml implements Meio{

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
    public String gerarItalico(String[] values) {
        return "<italic>" + values[0] + " " + values[1] + "</italic>\n";
    }

    @Override
    public String gerarComplementos(String[] values) {
        return values[0] + ": " + values[1] + "\n" 
                +values[2] + ": " + values[3] + "\n" 
                + values[4] + ": " + values[5] + "\n";
    }
        
    @Override
    public String gerarFooter() {
        return "</BODY>";
    }

    

}