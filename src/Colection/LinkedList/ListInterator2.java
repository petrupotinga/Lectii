package Colection.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListInterator2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Misa");
        list.add("Gicu");
        list.add("Maria");
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String elem = iterator.next();
            System.out.println(list);
            if (elem.equals("Misa")) {
                iterator.set("Misa1");   // inlocuirea elementului
                break;
            }
        }
        System.out.println(list);

    }
}
