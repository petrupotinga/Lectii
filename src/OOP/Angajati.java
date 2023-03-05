package OOP;

public class Angajati {
    String nume;
    String functia;
    int salariu;

    public Angajati(String nume, String functia, int salariu) {
        this.nume = nume;
        this.functia = functia;
        this.salariu = salariu;
    }
    String info (int i){
        int salariultotal = salariu * i;
        return "Lucratorul " + nume + " in fuctia de " + functia +
                " a primit un salariu pe " + i + " luni de " + salariultotal;
    }
}
