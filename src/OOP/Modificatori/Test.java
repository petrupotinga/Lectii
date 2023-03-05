package OOP.Modificatori;

public class Test {
    private String Name;
    private int age;

    public Test(String name, int age) {
        Name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Nume " + Name);
        System.out.println("Virsta " + age);
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("virsta trebuie sa fie mai mare ca 0");
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return Name;
    }
}
