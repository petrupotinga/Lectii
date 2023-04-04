package Scan;

public class ExercitiiGresite {
    int x;
    int y;
    int suma;

    public ExercitiiGresite(int x, int y, int suma) {
        this.x = x;
        this.y = y;
        this.suma = suma;
    }
    @Override
    public String toString() {
        return x + " + " + y + " = ";
    }

}

