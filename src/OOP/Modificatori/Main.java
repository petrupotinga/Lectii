package OOP.Modificatori;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(18);
        person.setName("Ion");
        System.out.println(person.getAge());
        System.out.println(person.getName());
    }
}
