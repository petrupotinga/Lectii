package Colection.ArrayList;

import java.util.ArrayList;

public class ArrayMethods2 {
    public static void main(String[] args) {
        ArrayList studentList = new ArrayList();
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.2);
        Student st2 = new Student("Nicolai", 'm', 22, 2, 8.1);
        Student st3 = new Student("Elena", 'f', 22, 3, 8.8);
        Student st4 = new Student("Petru", 'm', 22, 2, 8.4);
        Student st5 = new Student("Maria", 'f', 22, 2, 8.9);

        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);


        System.out.println(studentList);

//        Student st6 = new Student("Maria", 'f', 22, 2, 8.9);
//                           metoda remove
//        studentList.remove(st6);
//        System.out.println(studentList);
//                           metoda indexOf
//        System.out.println(studentList.indexOf(st5));

    }
}

class Student {
    private final String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String toString() {
        return "student (" + " name:" + name + ", sex:" +
                sex + ", age:" + age +
                ", course:" + course +
                ", avgGrade:" + avgGrade + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age && course == student.course
                && Double.compare(student.avgGrade, avgGrade) == 0
                && name.equals(student.name);
    }
}