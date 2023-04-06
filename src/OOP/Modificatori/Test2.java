package OOP.Modificatori;

public class Test2 {
    public static void main(String[] args) {

    }
}

class Person {
    private String name;
    private int age;

    public void setName(String username) {
        if (username.isEmpty()) {
            System.out.println("Cimpul nu poate fi gol");
        } else {
            name = username;
        }
    }

    public void setAge(int userage) {
        if (userage < 0) {
            System.out.println("Valoarea nu poate fi negativa");
        } else {
            age = userage;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}