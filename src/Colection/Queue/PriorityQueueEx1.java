package Colection.Queue;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueEx1 {
    public static void main(String[] args) {
        PriorityQueue<Student> priorityqueue = new PriorityQueue<>();
        Student st1 = new Student("Mihai", 2);
        Student st2 = new Student("Constantin", 4);
        Student st3 = new Student("Renat", 3);
        Student st4 = new Student("Ion", 5);
        Student st5 = new Student("Vitalii", 1);
        priorityqueue.add(st1);
        priorityqueue.add(st2);
        priorityqueue.add(st3);
        priorityqueue.add(st4);
        priorityqueue.add(st5);
        System.out.println(priorityqueue);
        System.out.println(priorityqueue.poll());
        System.out.println(priorityqueue.poll());
        System.out.println(priorityqueue.poll());
        System.out.println(priorityqueue.poll());
        System.out.println(priorityqueue.poll());
    }
}

class Student implements Comparable<Student> {
    String name;
    int course;

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

