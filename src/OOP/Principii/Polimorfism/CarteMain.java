package OOP.Principii.Polimorfism;

public class CarteMain {
    public static void main(String[] args) {
        Carte c1 = new Carte("Morometii", "Marin Preda");
        Carte c2 = new Carte("Fratii Jderi", "Mihail Sadoveanu");
        c1.fisaCarte();
        c1.fisaCarte(1);
        c2.fisaCarte(2);
    }
}

