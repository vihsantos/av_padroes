package bridge;

public interface Meio {
    public String gerarHeader();
    public String gerarComentario(String value);
    public String gerarNegrito(String value);
    public String gerarItalico(String value1, String value2);
    public String gerarComplementos(String label, String valor);
    public String gerarFooter();
}
