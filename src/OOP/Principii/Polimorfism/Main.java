package OOP.Principii.Polimorfism;

public class Main {
    public static void main(String[] args) {
        Figuri figuri = new Figuri();
        Figuri triunghi = new Triunghi();
        Figuri cerc = new Cerc();
        Figuri patrat = new Patrat();
        figuri.aria();
//        triunghi.aria();
//        cerc.aria();
        aria(triunghi);
        aria(cerc);
        aria(patrat);
    }

    public static void aria(Figuri figuri) {
        figuri.aria();
    }
}
