package OOP.Modificatori;

public class Main {
    public static void main(String[] args) {
        Test man = new Test("Ion", 18);
        man.setAge(24);
        man.showInfo();
        System.out.println(man.getAge());
        System.out.println(man.getName());
    }
}
