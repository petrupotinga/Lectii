package OOP.obiectParametru;

public class Cutie {
    public static void main(String[] args) {
        Box box = new Box(2);
        Box box1 = new Box(1, 2, 3);
        box1.setBox(6,8,9);
        Box box3 = box.sumBox(box1);
        Box box2 = new Box(box, box1);
        box2.showVolume();
        box1.showVolume();
        box2.compare(box1);
    }
}
