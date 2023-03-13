package Colection.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Student,Double> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        Student st1 = new Student("Zaur", "Prisacaru", 3);
        Student st2 = new Student("Marya", "Ivanova", 3);
        Student st3 = new Student("Serghey", "Petcov", 3);
        linkedHashMap.put(st1, 7.5);
        linkedHashMap.put(st2, 8.2);
        linkedHashMap.put(st3, 7.4);
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get(st1));
        System.out.println(linkedHashMap);
    }
}
