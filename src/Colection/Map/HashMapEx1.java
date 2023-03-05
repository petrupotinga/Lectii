package Colection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(125, "Popescu Valeriu");
        map1.put(128, "Frimu Victor");
        map1.put(132, "Prisacaru Anatol");
        map1.put(139, "Prisacaru Gicu");
        System.out.println(map1);
//        System.out.println(map1.get(125));
//        System.out.println(map1.containsValue("Prisacaru Anatol"));
//        System.out.println(map1.containsKey(127));
        map1.remove(128);
        System.out.println(map1);
        System.out.println(map1.keySet());
        System.out.println(map1.values());

    }
}
