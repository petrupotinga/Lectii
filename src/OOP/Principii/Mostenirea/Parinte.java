package OOP.Principii.Mostenirea;

public class Parinte {
    String myStr;

    public Parinte(String name) {
        myStr = name;
    }
}

class Copil extends Parinte {
    String myStr;

    public Copil(String name1, String name2) {
        super(name1);
        this.myStr = name2;
    }

    public void printDetails() {
        System.out.println("Din constructorul clasei de bază: " + super.myStr);
        System.out.println("Din constructorul clasei derivate: " + myStr);
    }
}

class Main1 {
    public static void main(String[] args) {
        Copil cobj = new Copil("Ion", "Vasile");
        cobj.printDetails();
    }
}


