package Proiecte;

import java.util.*;

public class ExercitiiGenerator {
    public static void main(String[] args) {
        List<Exercitiu> exercitiiGresite = new ArrayList<>();
        final int NUMARUL_TOTAL_DE_EXERCITII = 2;
        Scanner scanner = new Scanner(System.in);
        Generator generator = new Generator();
        for (int i = 0; i < NUMARUL_TOTAL_DE_EXERCITII; i++) {
            Exercitiu exercitiu = generator.generatorExercitiu();
            int rezultatulOperatiei = exercitiu.getRezultatulOperatiei();
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
            if (primulExercitiu.getRezultatulOperatiei() == raspuns) {
                exercitiiGresite.remove(primulExercitiu);
            }
        }
        System.out.println(exercitiiGresite);
        scanner.close();
    }
}



