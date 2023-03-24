package Scan;

import java.util.Scanner;

public class ScanerEx1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("introdu numarul");
//        int i = scanner.nextInt();
//        System.out.println("Numarul introdus :" + i);
//        System.out.println("Inrtoduceti doua numare : ");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        System.out.println("Intrgul : " + x/y);
//        System.out.println("Restul : " + x%y);
//        System.out.println("scrieti doua rinduri:");
//        String s1 = scanner.nextLine();
//        String s2 = scanner.nextLine();
//        System.out.println("Ati scris in primul rind : " + s1);
//        System.out.println("Ati scris in al doilea rind : " + s2);
//        System.out.println("introdu numarul: ");
//        double i = scanner.nextDouble();
//        System.out.println("Numarul introdus :" + i);
        Scanner scanner = new Scanner("Salut prietene! \n Cum dispozitia \n" +
                "ce mai este nou? ");
//        String s1 = scanner.nextLine();
//        System.out.println(s1);
//        System.out.println(scanner.nextLine());
//        System.out.println(scanner.nextLine());
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
//        System.out.println(scanner.next().charAt(2));
    }
}
