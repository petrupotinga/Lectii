package Colection.ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
//              metoda add
        arrayList.add("Laura");
        arrayList.add("Ion");
        arrayList.add("Maria");
        arrayList.add("Misa");
        arrayList.add("Vanea");
        for (String i : arrayList) {
            System.out.print(i + " ");
        }
        System.out.println();

        ArrayList <Integer> arrayList2 = new ArrayList<>();    // adaugare de elemente int
        arrayList2.add(3);
        for (int i = 0; i < arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));               // getter
        }
//             metoda getter: intoarce elementul de pe indexul dat
//        System.out.println(arrayList.get(2));
//                      putem intoarce toate elementele listei
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.print(arrayList.get(i));
//        }
//             metoda setter-inlocuieste sau /pune/ element pe indexul dat
//        arrayList.set(1, "Masha");
//                       metoda remove sterge element
//        arrayList.remove(0);
//        System.out.println(arrayList);
//                        metoda size
//        System.out.println(arrayList.size());
//                        metoda isEmpty
//        System.out.println(arrayList.isEmpty());
//                       metoda contains
//        System.out.println(arrayList.contains("Ion"));
//                           metoda clear
//        arrayList1.clear();
//        System.out.println(arrayList1);
    }
}
