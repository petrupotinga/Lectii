package Scan;

public class Exercitiu {
    int x;
    int y;
    int rezultatulOperatiei;
    String semn;

    public Exercitiu(int x, int y, int rezultatulOperatiei, String semn) {
        this.x = x;
        this.y = y;
        this.rezultatulOperatiei = rezultatulOperatiei;
        this.semn = semn;
    }

    @Override
    public String toString() {
        return x + "" + semn + "" + y + " = ";
    }
}

