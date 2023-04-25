package Exceptii;

public class TestThrow1 {
    public static void validate(int age) {
        if (age < 18) {
            //throw Arithmetic exception if not eligible to vote
            throw new ArithmeticException("Persoana nu este eligibilă pentru vot");
        } else {
            System.out.println("Persoana este eligibilă pentru vot");
        }
    }
}
