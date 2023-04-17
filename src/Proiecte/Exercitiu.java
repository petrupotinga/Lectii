package Proiecte;

public class Exercitiu {
    private final int x;
    private final int y;
    private final int rezultatulOperatiei;
    private final String semn;

    public Exercitiu(int x, int y, int rezultatulOperatiei, String semn) {
        this.x = x;
        this.y = y;
        this.rezultatulOperatiei = rezultatulOperatiei;
        this.semn = semn;
    }
    
    public int getRezultatulOperatiei() {
        return rezultatulOperatiei;
    }
    @Override
    public String toString() {
        return x + semn + y + " = ";
    }
}

