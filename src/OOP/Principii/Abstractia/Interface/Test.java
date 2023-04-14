package OOP.Principii.Abstractia.Interface;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(121);
        Person person1 = new Person("Vasile");
        outputInfo(animal1);
        outputInfo(person1);
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
