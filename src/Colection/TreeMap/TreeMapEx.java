package Colection.TreeMap;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Double, Student> treemap = new TreeMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Ion", "Popescu", 3);
        Student st3 = new Student("Victor", "Ivanov", 3);
        Student st4 = new Student("Petru", "Adam", 3);
        Student st5 = new Student("Ilie", "Croitor", 3);
        Student st6 = new Student("Maria", "Rotaru", 3);
        Student st7 = new Student("Victoria", "Melnic", 3);
        treemap.put(5.8, st1);
        treemap.put(9.1, st2);
        treemap.put(6.4, st3);
        treemap.put(7.5, st4);
        treemap.put(7.2, st5);
        treemap.put(8.2, st6);
        treemap.put(7.9, st7);
        Student st8 = new Student("Victoria", "Melnic", 3);
        treemap.put(3.2, st8);
        System.out.print(treemap);
        System.out.println();
//        System.out.println(treemap.get(7.5));
//        System.out.println(treemap.descendingMap());
        System.out.println(treemap.lastEntry());


    }
}

class Student {    // implements Comparable<Student> {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.name.compareTo(o.name);
//    }
}