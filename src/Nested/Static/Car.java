package Nested.Static;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a;


    public Car(String color, int doorcount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }
    void method(){
        System.out.println(Engine.countOfObjects);
        Engine e = new Engine(200);
        System.out.println(e.horsePower);
    }

    @Override
    public String toString() {
        return "My car{" +
                "color='" + color + '\'' +
                ", doorcount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {
        int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            System.out.println(a);
//            System.out.println(doorCount);
            this.horsePower = horsePower;
            countOfObjects ++;
        }

        @Override
        public String toString() {
            return "My Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

