package Exceptii;

import java.util.Scanner;

public class ExceptionThrow2 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x < 10) {
                throw new ScannerException("Utilizatorul ai introdus date incorecte!");
            }
        }
    }
}
