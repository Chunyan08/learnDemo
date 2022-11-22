package CollectDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        /*
        *HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。
        *
        *实现了 Map 接口，根据键的 HashCode 值存储数据，具有很快的访问速度，最多允许一条记录的键为 null，不支持线程同步
        *无序
        *
        * */
        //键值对
        Map<String,Integer> map = Map.of("string",1,"hhhhh",2,"sss",4);
        Map<Integer,String> map1 = Map.of(1,"string",2,"setting");
        //get(key)
        System.out.println(map.get("hhhhh"));
        //直接遍历
        System.out.println(map);

        HashMap<String,String> hashMap = new HashMap<String,String>();
        hashMap.put("s","svalue");
        hashMap.put("a","avalue");
        hashMap.put("b","bvalue");
        hashMap.remove("a");
        System.out.println(hashMap);
        System.out.println(hashMap.size());

        for(String key: hashMap.keySet()){
            System.out.println("key " + key + " value: " + hashMap.get(key));
        }
        for(String valye: hashMap.values()){
            if (valye.length() < 2){
                System.out.println("value " + valye);
            }
        }

    }
}
