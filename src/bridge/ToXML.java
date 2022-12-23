package bridge;

import java.util.Map;

public class ToXML implements Meio{

    @Override
    public String converter(Map<String, String> map) {
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
    
}
