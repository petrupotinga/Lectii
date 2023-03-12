package Colection.Map;

import java.util.*;

public final class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Zaur", "Prisacaru", 3);
        Student st2 = new Student("Marya", "Ivanova", 3);
        Student st3 = new Student("Serghey", "Petcov", 3);
        map.put(st1, 7.5);
        map.put(st2, 8.2);
        map.put(st3, 7.4);
        System.out.println(map);
        Student st4 = new Student("Zaur", "Prisacaru", 3);
        boolean rezult = map.containsKey(st4);
        System.out.println(rezult);
        System.out.println(st1.equals(st4));
//        System.out.println(st1.hashCode());
//        System.out.println(st4.hashCode());
//        st1.course = 4;
//        System.out.println(st1.hashCode());
//        for (Map.Entry<Student, Double> entry : map.entrySet()) {                // Cheie : valoare
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
    }
}

final class Student {
    final private String name;
    final private String surname;
    final private int course;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}