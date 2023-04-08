package Proiecte;

import java.util.*;

public class ExercitiiGenerator {
    public static void main(String[] args) {
        final int NUMARUL_TOTAL_DE_EXERCITII = 10;
        Scanner scanner = new Scanner(System.in);
        List<Exercitiu> exercitiiGresite = new ArrayList<>();
        for (int i = 0; i < NUMARUL_TOTAL_DE_EXERCITII; i++) {
            Generator generator = new Generator();
            Exercitiu exercitiu = generator.generatorExercitiu();
            int rezultatulOperatiei = exercitiu.rezultatulOperatiei;
            System.out.println(exercitiu);
            int raspuns = scanner.nextInt();
            System.out.println("raspunsul primit :" + raspuns);
            if (rezultatulOperatiei == raspuns) {
                System.out.println("raspuns corect, Bravo!");
            } else {
                System.out.println("raspuns gresit ");
                exercitiiGresite.add(exercitiu);
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



