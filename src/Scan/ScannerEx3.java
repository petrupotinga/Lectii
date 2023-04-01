package Scan;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ExercitiiGresite> raspunsuri = new ArrayList<>();
        Random r = new Random();
        for (int i = 1; i <= 3; i++) {
            int x = r.nextInt(10) + 1;
            int y = r.nextInt(10) + 1;
            int suma = x + y;
            System.out.println(x);
            System.out.println(y);
            ExercitiiGresite ex = new ExercitiiGresite(x,y,suma);
            String exercitiu = x + " + " + y + " = ";
            System.out.println(exercitiu);
            int raspuns = scanner.nextInt();
            System.out.println("raspunsul primit :" + raspuns);
            if (suma == raspuns) {
                System.out.println("raspuns corect, Bravo!");
            }  else {
                System.out.println("raspuns gresit: ");
                raspunsuri.add(ex);
            }
        }
        scanner.close();
        System.out.println(raspunsuri);
    }
}