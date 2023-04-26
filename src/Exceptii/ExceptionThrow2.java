package Exceptii;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionThrow2 {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        while(true){
            int x = Integer.parseInt(scanner.nextLine());
            if(x != 1){
                throw new IOException();
            }

        }

    }
}
