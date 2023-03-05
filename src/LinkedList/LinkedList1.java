package LinkedList;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Ion", 2);
        Student2 st2 = new Student2("Nicolay", 2);
        Student2 st3 = new Student2("Elena", 3);
        Student2 st4 = new Student2("Petr", 4);
        Student2 st5 = new Student2("Maria", 3);
        LinkedList<Student2> list = new LinkedList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        System.out.println(list);
    }
}

class Student2 {
    String nume;
    int courese;

    public Student2(String nume, int courese) {
        this.nume = nume;
        this.courese = courese;
    }

    @Override
    public String toString() {
        return "studentul ( " + nume +
                " este cursul " + courese + ")";
    }
}
