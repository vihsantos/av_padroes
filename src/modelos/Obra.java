package modelos;

import java.util.Map;

import visitor.Visitor;

public interface Obra {
	
	public String getTitulo();
	public Integer getAno();
	public Double getAvaliacao();
	public Map<String, String> accept(Visitor visitor);

}