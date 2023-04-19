package OOP.Principii.Mostenirea;

public class Punct extends Coordonate{
    private String nume;
    public Punct() {
        super();
        setNume("P");
    }
    public Punct(double x, double y) {
        super(x,y);
        setNume("P");
    }
    public Punct(double x, double y, String nume) {
        this(x,y);
        setNume(nume);
    }
    public Punct(Coordonate c, String nume) {
        this(c.getX(),c.getY());
        setNume(nume);
    }
    public void setNume(String nume){
        this.nume = nume;
    }
    public String toString() {
        return nume + super.toString();
    }
}

