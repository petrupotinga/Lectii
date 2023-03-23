package Scan;

import java.util.Scanner;

public class ScanerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introdu numarul");
        int i = scanner.nextInt();
        System.out.println("Numarul introdus" + i);
        System.out.println("Inrtoduceti al doilea numar");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println();
    }
}
