package Scan;

import java.util.Random;
import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = null;
        Random r = new Random();
        int x = r.nextInt(10) + 1;
        int y = r.nextInt(10) + 1;
        int suma = x + y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(x + " + " + y + " = ");
        try {
            scanner = new Scanner(System.in);
            int raspuns = scanner.nextInt();
            System.out.println("raspunsul este :" + raspuns);
            if (suma == raspuns) {
                System.out.println("raspuns Corect");
            } else {
                System.out.println("raspuns gresit");
            }
        } finally {
            scanner.close();
        }
    }
}