package Colection.Set;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Mihai", 2);
        Student st2 = new Student("Constantin", 4);
        Student st3 = new Student("Renat", 3);
        Student st4 = new Student("Ion", 5);
        Student st5 = new Student("Vitalii", 1);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
//        System.out.println(treeSet);
//        System.out.println(treeSet.first());
//        System.out.println(treeSet.last());
        Student st6 = new Student("Victor", 3);
//        Student st7 = new Student("Andrei", 5);
//        System.out.println(treeSet.subSet(st6,st7));
//        System.out.println(treeSet.tailSet(st6));
        System.out.println(st3.equals(st6));
        System.out.println(st3.hashCode()==st6.hashCode());

    }
}

class Student implements Comparable<Student> {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return this.course - other.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
