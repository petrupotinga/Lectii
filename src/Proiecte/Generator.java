package Proiecte;

import java.util.Random;

public class Generator {
    Exercitiu generatorExercitiu() {
        Random r = new Random();
        int rezultatulOperatiei;
        String semn;
        int x = r.nextInt(10) + 1;
        int y = r.nextInt(10) + 1;
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
        Exercitiu exercitiu = new Exercitiu(x, y, rezultatulOperatiei, semn);
        return exercitiu;
    }
}