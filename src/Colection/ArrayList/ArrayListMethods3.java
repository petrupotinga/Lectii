package Colection.ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        String petrea = "petrea";
        StringBuilder petrea1 = new StringBuilder("petrea");
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
//                         metoda asLIst
        StringBuilder [] array = {sb1, sb2, sb3, sb4};
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);
//        array[0].append("!!!!");               // modificarea elementului cu indexul 0 al sirului
        array[0]= new StringBuilder("F");        // inlocuirea elementului cu indexul 0 al sirului
        System.out.println(list);
    }
}
