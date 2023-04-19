package OOP.Principii.Mostenirea;

public class MostenireaMain {
    public static void main(String[] args) {
        Coordonate c1 = new Coordonate();
        Coordonate c2 = new Coordonate(1, 2);
        Punct p1 = new Punct();
        Punct p2 = new Punct(1, 1);
        Punct p3 = new Punct(1, 2, "P3");
        Punct p4 = new Punct(c1, "P4");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        c1 = p1; //subclasa = superclasa
        System.out.println(c1);
        c1 = c2;
        System.out.println(c1);
    }
}

