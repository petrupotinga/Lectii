package Colection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Interator {
    public static void main(String[] args) {
        ArrayList <String> lista = new ArrayList <>();
        lista.add("Mihaiela");
        lista.add("Ion");
        lista.add("Maria");

        Iterator<String> iterator = lista.iterator();
        while(iterator.hasNext()){
            String list = iterator.next();
            System.out.println(list);
        }
    }
}
