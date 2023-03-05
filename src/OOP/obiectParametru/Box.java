package OOP.obiectParametru;

public class Box {
    private int wigth;
    private int height;
    private int leight;

    Box(int wigth, int height, int leight) {
        this.wigth = wigth;
        this.height = height;
        this.leight = leight;
    }


    Box(int size) {
        this.wigth = size;
        this.height = size;
        this.leight = size;
    }

    Box(Box box1, Box box2) {
        this.wigth = box1.wigth + box2.wigth;
        this.height = box1.height + box2.height;
        this.leight = box1.leight + box2.leight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLeight(int leight) {
        this.leight = leight;
    }

    double volume() {
        return wigth * height * leight;
    }

    public void showVolume() {
        System.out.println(volume());
    }

    Box sumBox(Box box) {
        return new Box(this.wigth + box.wigth, this.height + box.height, this.leight + box.leight);
    }

    void compare(Box box) {
        double thisVolume = this.volume();
        double boxVolume = box.volume();
        if (thisVolume > boxVolume) {
            System.out.println("cutia noasta e mai mare");
        } else if (thisVolume < boxVolume) {
            System.out.println("cutia noastra e mai mica");
        } else {
            System.out.println("cutiile sunt egale");
        }
    }

    public void setBox(int wigth, int height, int leight) {
        if (wigth > 0 && height > 0 && leight > 0) {
            this.wigth = wigth;
            this.height = height;
            this.leight = leight;
        } else {
            System.out.println("marimile nu sunt corecte");
        }
    }

}
