package bridge;

import java.util.Map;

public class ToJson implements Meio{

    @Override
    public String converter(Map<String, String> map) {
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
    
}
