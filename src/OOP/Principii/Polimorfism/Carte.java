package OOP.Principii.Polimorfism;

public class Carte {
    String titlu;
    String autor;
    Carte(String titlu, String autor) {
        this.titlu = titlu;
        this.autor = autor;
    }
    void fisaCarte() {
        System.out.println("Titlu: " + titlu);
        System.out.println("Autor: " + autor);
    }
    void fisaCarte(int id) {
        System.out.println("Id: " + id);
        System.out.println("Titlu: " + titlu);
        System.out.println("Autor: " + autor);
    }
}
