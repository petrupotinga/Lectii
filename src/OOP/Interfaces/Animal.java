package OOP.Interfaces;

public class Animal implements Info {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("dorm");
    }

    @Override
    public void showInfo() {
        System.out.println("Id este: " + id);
    }
}
