package OOP.Principii.Mostenirea;

public class Student extends Person1 {
    private String name;
    private int age;
    private double medie;

    public Student(String name, int age, double medie) {
        super(name, age);
        this.medie = medie;
    }

    Student(String name, int age) {
        super(name, age);
    }
    public double getMedie(){
        return medie;
    }
}
