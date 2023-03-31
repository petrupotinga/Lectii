package Nested.Static;

public class Car {
    String color;
    int doorcount;
    Engine engine;

    public Car(String color, int doorcount, Engine engine) {
        this.color = color;
        this.doorcount = doorcount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car{" +
                "color='" + color + '\'' +
                ", doorcount=" + doorcount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

