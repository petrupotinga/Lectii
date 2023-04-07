package Proiecte;

import java.util.*;

public class ExercitiiGenerator {
    public static void main(String[] args) {
        final int NUMARUL_TOTAL_DE_EXERCITII = 10;
        String semn;
        int rezultatulOperatiei;
        Scanner scanner = new Scanner(System.in);
        List<Exercitiu> exercitiiGresite = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < NUMARUL_TOTAL_DE_EXERCITII; i++) {
            int x = r.nextInt(10) + 1;
            int y = r.nextInt(10) + 1;
//            System.out.println(x);
//            System.out.println(y);
            if (x < y) {
                int temp = x;
                x = y;
                y = temp;
                System.out.println("Schimbare de loc intre numere!");
            }
            int operatia = r.nextInt(2);
            if (operatia == 0) {
                rezultatulOperatiei = x + y;
                semn = " + ";
            } else {
                rezultatulOperatiei = x - y;
                semn = " - ";
            }
            System.out.println(x);
            System.out.println(y);
            Exercitiu exercitiuCurent = new Exercitiu(x, y, rezultatulOperatiei, semn);
            System.out.println(exercitiuCurent);
            int raspuns = scanner.nextInt();
            System.out.println("raspunsul primit :" + raspuns);
            if (rezultatulOperatiei == raspuns) {
                System.out.println("raspuns corect, Bravo!");
            } else {
                System.out.println("raspuns gresit ");
                exercitiiGresite.add(exercitiuCurent);
            }
        }
        System.out.println(exercitiiGresite);

        while (!exercitiiGresite.isEmpty()) {
            Exercitiu primulExercitiu = exercitiiGresite.get(0);
            System.out.println(primulExercitiu);
            int raspuns = scanner.nextInt();
            if (primulExercitiu.rezultatulOperatiei == raspuns) {
                exercitiiGresite.remove(primulExercitiu);
            }
        }
        System.out.println(exercitiiGresite);
        scanner.close();
    }
}



