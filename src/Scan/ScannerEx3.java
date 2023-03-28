package Scan;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> raspunsuri = new ArrayList<>();
        Random r = new Random();
        int x = r.nextInt(10) + 1;
        int y = r.nextInt(10) + 1;
        int suma = x + y;
        System.out.println(x);
        System.out.println(y);
        for (int i = 1; i <= 3; i++) {
            System.out.println(x + " + " + y + " = ");
            int raspuns = scanner.nextInt();
            System.out.println("raspunsul primit :" + raspuns);
            if (suma == raspuns) {
                System.out.println("raspuns corect, Bravo!");
                break;
            } else if (i == 3) {
                System.out.println(" rapuns gresit, nu mai ai incercari!");
                raspunsuri.add(raspuns);
            } else {
                System.out.println("raspuns gresit, mai incearca: ");
                raspunsuri.add(raspuns);
            }
        }
        scanner.close();
        System.out.println(raspunsuri);
    }
}