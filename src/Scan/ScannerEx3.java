package Scan;

import java.util.*;

public class ScannerEx3 {
    public static void main(String[] args) {
        final int NUMARUL_TOTAL_DE_EXERCITII = 3;
        final int MAX = 10;
        Scanner scanner = new Scanner(System.in);
        List<Exercitiu> exercitiiGresite = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < NUMARUL_TOTAL_DE_EXERCITII; i++) {
            int x = r.nextInt(MAX) + 1;
            int y = r.nextInt(MAX) + 1;
            final int suma = x + y;
            System.out.println(x);
            System.out.println(y);
            Exercitiu exercitiuCurent = new Exercitiu(x, y, suma);
            System.out.println(exercitiuCurent.showExercitiu());
            int raspuns = scanner.nextInt();
            System.out.println("raspunsul primit :" + raspuns);
            if (suma == raspuns) {
                System.out.println("raspuns corect, Bravo!");
            } else {
                System.out.println("raspuns gresit ");
                exercitiiGresite.add(exercitiuCurent);
            }
        }
//        System.out.println(exercitiiGresite);

        for (Exercitiu e : exercitiiGresite) {
            System.out.print(e.showExercitiu() + "  ");

        }

        while (!exercitiiGresite.isEmpty()) {
            Exercitiu primulExercitiu = exercitiiGresite.get(0);
            System.out.println(primulExercitiu.showExercitiu());
            int raspuns = scanner.nextInt();
            if (primulExercitiu.suma == raspuns) {
                exercitiiGresite.remove(primulExercitiu);
            }
        }
        System.out.println(exercitiiGresite);
        scanner.close();
    }
}


