package Colection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
//              metoda add
        arrayList1.add("Laura");
        arrayList1.add("Ion");
        arrayList1.add("Maria");
        arrayList1.add("Misa");
        arrayList1.add("Elena");
        System.out.println("arrayList1 = " + arrayList1);

                  // metoda List.of- creaza liste noi care nu pot fi modificate
       List<Integer> list1 = List.of(3,4,5);
        System.out.println(list1);
                 // metoda List.copyOf-primeste param Colectie si returneaza lista
        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);

                    // metoda toArray- din lista obtinem un sir
//        Object[] array = arrayList1.toArray();
//        String[] array2 = arrayList1.toArray(new String[0]);
//        for (String d : array2) {
//            System.out.print(d); }         //sau
//        System.out.println(Arrays.toString(array2));

                      // metoda subList
//        List<String> myList = arrayList1.subList(1,4);
//        System.out.println(myList);

                    // metoda removeAll-sterge elementele listei2 din lista1
//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Laura");
//        arrayList2.add("Misa");
//        arrayList2.add("Catea");
//        arrayList1.removeAll(arrayList2);
//        System.out.println(arrayList1);

                 // metoda retainAll nu sterge elementele din lista1 care sint in lista2
//        arrayList1.retainAll(arrayList2);
//        System.out.println(arrayList1);

                  // metoda contains-vrerifica daca toate elem din lista2 se contin in lista1
//        boolean rezult = arrayList1.contains(arrayList2);
//        System.out.println(rezult);

    }
}

