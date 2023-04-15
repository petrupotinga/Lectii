package OOP.Principii.Polimorfism;

public class Suprascriere {
}


class Parent {
    void print() {
        System.out.println("Parent::Print() method");
    }
}

class Child1 extends Parent {

    @Override
    void print() {
        System.out.println("child1::Print() method");
    }
}

class Child2 extends Parent {
    @Override
    void print() {
        System.out.println("child2::Print() method");
    }
}

class Main2 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.print();
        Parent child1 = new Child1();
        child1.print();
        Parent child2 = new Child2();
        child2.print();
    }
}
