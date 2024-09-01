package Task4;

import java.util.HashMap;
import java.util.Map;

public class MapImplement {

    private Map<String, String> map;


    public MapImplement() {
        this.map = new HashMap<>();
    }

    public void addToStorage(String key, String value){
         map.put(key, value);
     }

    public String findValues(String key){
        return map.get(key);
    }

    void printValues(){
        for(String i : map.values()){
            System.out.println(i);
        }
    }

}
