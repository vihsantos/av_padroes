package bridge;

public interface Meio {
    public String gerarHeader();
    public String gerarComentario(String value);
    public String gerarNegrito(String value);
    public String gerarItalico(String[] values);
    public String gerarComplementos(String[] values);
    public String gerarFooter();
}
