package OOP.Principii.Mostenirea;

public class Coordonate {
    private double x;
    private double y;

    Coordonate() {
        setX(0);
        setY(0);
    }

    Coordonate(double x, double y) {
        setX(x);
        setY(y);
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
