package OOP.Principii.Mostenirea;

public class Baseclass {
    String myStr;
}

class Subclass extends Baseclass {
    String myStr;

    public void printdetails() {

        super.myStr = "Super";
        myStr = "Sub";
        System.out.println("Superclass myStr :" + super.myStr + " și Subclass myStr:' + myStr");
    }
}

class MainSuper {
    public static void main(String[] args) {
        Subclass cobj = new Subclass();
        cobj.printdetails();
    }
}


