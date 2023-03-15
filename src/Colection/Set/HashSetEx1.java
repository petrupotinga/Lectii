package Colection.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Petru");
        set.add("Misa");
        set.add("Maria");
        set.add("Grigore");
//        System.out.println(set);
//        for (String s: set) {
//            System.out.println(s);
        set.remove("Misa");
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
