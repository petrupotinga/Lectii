package Proiecte;

import java.util.Arrays;

public class Exercitiu1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int rezult = sumaPatratelor(array);
        System.out.println("Suma patratelor numerelor pare este : " + rezult);
    }

    public static int sumaPatratelor(int[] array) {
        return Arrays.stream(array).filter(num -> num % 2 == 0).map(num -> num * num).sum();

//        int suma = 0;
//        for (int num : array) {
//            if (num % 2 == 0) {
//                suma += num * num;
//            }
//        }
//        return suma;
    }
}
