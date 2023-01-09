package modelos;

import visitor.Visitor;

public interface Obra {
	
	public String getTitulo();
	public Integer getAno();
	public Double getAvaliacao();
	public String getAutor();
	public void accept(Visitor visitor);
}