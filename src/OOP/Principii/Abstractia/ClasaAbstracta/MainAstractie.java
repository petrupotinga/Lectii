package OOP.Principii.Abstractia.ClasaAbstracta;

public class MainAstractie {
    public static void main(String[] args) {
        Bank b;
        b = new CITY();
        System.out.println("Rata dobinzii a CITY este: " + b.getInterestRate() + "%");
        b = new HSBC();
        System.out.println("Rata dobinzii a HSBC este: " + b.getInterestRate() + "%");
    }
}
