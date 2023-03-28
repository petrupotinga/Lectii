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
        while (true) {
            System.out.println(x + " + " + y + " = ");
            scanner = new Scanner(System.in);
            int raspuns = scanner.nextInt();
            System.out.println("raspunsul primit :" + raspuns);
            if (suma == raspuns) {
                System.out.println("raspuns corect");
                break;
            } else {
                System.out.println("raspuns gresit, mai incearca: ");
            }
        }
    }
}