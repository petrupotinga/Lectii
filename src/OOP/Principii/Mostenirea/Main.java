package OOP.Principii.Mostenirea;

public class Main {
    public static void main(String[] args) {
//        Person1 person = new Person1();
//        person.setAge(18);
//        person.setName("Ion");
//        System.out.println(person.getAge());
//        System.out.println(person.getName());
        Student S = new Student("Ion", 25,8.2);
        System.out.println(S);
        System.out.println(S.getMedie());

    }
}
