package Scan;

public class Exercitiu {
    int x;
    int y;
    int suma;

    public Exercitiu(int x, int y, int suma) {
        this.x = x;
        this.y = y;
        this.suma = suma;
    }

    public String showExercitiu() {
        return x + " + " + y + " = ";
    }

    @Override
    public String toString() {
        return "Exercitiu{" +
                "x=" + x +
                ", y=" + y +
                ", suma=" + suma +
                '}';
    }
}

