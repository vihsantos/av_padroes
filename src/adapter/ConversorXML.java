package adapter;

import java.util.HashMap;
import java.util.Map;

import modelos.Obra;

public class ConversorXML implements Obra{
	
	public ConversorXML(Obra o) {
		this.o = o;
	}

	private Obra o;
	
    public String XML(Map<String, String> map) {
        String toXML = "<" + map.get("tipo") + " " + "titulo" + " = " + map.get("titulo")  + " ano" + " = " + map.get("ano");
        

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if(!entry.getKey().equals("tipo") 
                & !entry.getKey().equals("titulo") 
                & !entry.getKey().equals("ano"))
                toXML = "\n<" + entry.getKey() + ">" + entry.getValue() + "</" + entry.getKey() + ">";
        }

        toXML = "</" + map.get("tipo") + ">";

        return toXML; 
    }
    
	@Override
	public String toString() {
		String info = o.toString();
        info = info.substring(1, info.length()-1); 
        
        String[] keyValuePairs = info.split(",");             
        Map<String,String> map = new HashMap<>();               

        for(String pair : keyValuePairs){
            String[] entry = pair.split("="); 
            map.put(entry[0].trim(), entry[1].trim());
        }
		
		return XML(map);
	}

	@Override
	public String getTitulo() {
		return o.getTitulo();
	}

	@Override
	public Integer getAno() {
		return o.getAno();
	}

	@Override
	public Double getAvaliacao() {
		return o.getAvaliacao();
	}
	
}