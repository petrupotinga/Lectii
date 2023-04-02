package Nested.Static;

public class TestCar {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(280);
        System.out.println(engine);
        Car car = new Car("red", 2, engine);
        System.out.println(car);

    }
}

class z extends Car.Engine {
    z() {
        super(200);
    }
}