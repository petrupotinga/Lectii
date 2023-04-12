package OOP.Interfaces;

public class Animal implements Info {
    private int id;
    public Animal(int id){
        this.id = id;
    }
    @Override
    public void showInfo() {
        System.out.println("Id este: " + id);
    }
}
