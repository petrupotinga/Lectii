package OOP.Comaparator;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 1255);
        Employee emp2 = new Employee(125, "Ion", "Prisacaru ", 1255);
        Employee emp3 = new Employee(108, "Anatol", "Croitor", 1255);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println(list);
    }
}

class Employee {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}