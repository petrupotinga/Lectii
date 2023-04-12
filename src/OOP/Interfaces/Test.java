package OOP.Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(121);
        Person person1 = new Person("Vasile");
        animal1.showInfo();
        person1.showInfo();
    }
}
