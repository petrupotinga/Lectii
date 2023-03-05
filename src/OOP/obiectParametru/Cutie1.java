package OOP.obiectParametru;

public class Cutie1 {
    public static void main(String[] args) {
        Box1 box1 = new Box1(10);
        Box1 box2 = box1.mareste(2);
//        Box1 box2 = new Box1(box1);
//        box2.setdimens(1,2,3);
//        int rezComparare = box2.copara1(box1);
//        if (rezComparare == 1) {
//            System.out.println("cutia noastra e mai mare");
//        } else if (rezComparare == -1) {
//            System.out.println("cutia noastra este mai mica");
//        } else if (rezComparare == 0) {
//            System.out.println("cutiile sunt egale");
//        }
//        Box1 box3 = new Box1(box1, box2);
//        Box1 box4 = box1.cutiaMare(box2);
//        box4.showVolume();
//        box1.cutiaMare(box2);
        box1.showVolume();
        box2.showVolume();
//        box3.showVolume();
//        box1.copara1(box2);
    }
}
