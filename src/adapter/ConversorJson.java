package adapter;

import java.util.HashMap;
import java.util.Map;

import modelos.Obra;

public class ConversorJson implements Obra{
	
	public ConversorJson(Obra o) {
		this.o = o;
	}

	private Obra o;
	
    public String json(Map<String, String> map) {
        map.remove("tipo");
        String toJson = "{\n"; 

        for (Map.Entry<String, String> entry : map.entrySet()){
            if (entry.getKey()!= "ano"){
                toJson +=  "\""+ entry.getKey() + "\"" +" : " + "\"" +entry.getValue() + "\"" + "\n";
            }
        }

        toJson += "}";
        
        return toJson;     
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
		
		return json(map);
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
