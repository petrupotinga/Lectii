package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("Salut");
        al.add("Poka");
        al.add("ok");
        al.add("invatam java");
        al.add("anume Lamda");
        System.out.println(al);
//        al.removeIf(elem->elem.length()<5);
        Predicate<String> p = elem -> elem.length() < 5;
        al.removeIf(p);
        System.out.println(al);
    }
}
