package OOP.Comaparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEx {
    public static void main(String[] args) {
        List<Employee1> list = new ArrayList<Employee1>();
        Employee1 emp1 = new Employee1(100, "Zaur", "Tregulov", 12545);
        Employee1 emp2 = new Employee1(125, "Ion", "Prisacaru ", 18255);
        Employee1 emp3 = new Employee1(108, "Anatol", "Croitor", 14878);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println("dupa sortare" + list);

    }
}

class Employee1 implements Comparable<Employee1> {
    int id;
    String name;
    String surname;
    int slalry;

    public Employee1(int id, String name, String surname, int slalry) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.slalry = slalry;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", slalry=" + slalry +
                '}';
    }

    @Override
    public int compareTo(Employee1 o) {
//        if(this.id == o.id){
//            return 0;
//        }else if (this.id<o.id){
//            return -1;
//        }
//        else {
//            return 1;
//        }

//        return this.id-o.id;

//        return this.name.compareTo(o.name);

        int rezult = this.name.compareTo(o.name);
        if (rezult == 0) {
            rezult = this.surname.compareTo(o.surname);
        }
        return rezult;
    }
}
