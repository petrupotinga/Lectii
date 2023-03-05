package OOP.Static;

public class MyMach {
    private static final double pi = 3.14;

    public static int square(int number) {
        return number * number;
    }

    public static double leingt(double radius) {
        return 2 * pi * radius;
    }

    public static double area(double radius) {
        return pi * radius * radius;
    }

    public static int sum(int... numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum = sum + i;
        }
        return sum;
    }
}
