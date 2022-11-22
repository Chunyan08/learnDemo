package CollectDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        //Map
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("lucy",28);
        map.put("Jamie",5);
        //容量较大时使用
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        for(String key: map.keySet()){
            System.out.println("key:" + key + " value:" + map.get(key));
        }

        for(Integer v: map.values()){
            System.out.println("value: " + v);
        }
    }
}
