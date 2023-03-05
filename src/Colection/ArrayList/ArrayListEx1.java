package Colection.ArrayList;

import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Laura");
        arrayList1.add("Ion");
        arrayList1.add("Maria");
        System.out.println(arrayList1);
        ArrayList<String> arrayList2 = new ArrayList<>(arrayList1);
        System.out.println(arrayList2);
//                    metoda addAll
        ArrayList <String> arrayList3 = new ArrayList<>();
        arrayList3.add("iiii");
        arrayList3.add("oooo");
        arrayList1.addAll(2,arrayList3);
        System.out.println(arrayList1);

    }

}
