package OOP.obiectParametru;

public class Box1 {
    int lungime;
    int latime;
    int inaltime;

    public Box1(int lungime, int latime, int inaltime) {
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    public Box1(int marime) {
        this.lungime = marime;
        this.latime = marime;
        this.inaltime = marime;

    }

    Box1(Box1 box1, Box1 box2) {
        this.lungime = box1.lungime + box2.lungime;
        this.latime = box1.latime + box2.latime;
        this.inaltime = box1.inaltime + box2.inaltime;
    }

    Box1(Box1 box) {
        this.lungime = box.lungime;
        this.latime = box.latime;
        this.inaltime = box.inaltime;
    }

    double volume() {
        return lungime * latime * inaltime;

    }

    void showVolume() {
        double volume = lungime * latime * inaltime;
        System.out.println(volume);
    }

    void setdimens(int lungime, int latime, int inaltime) {
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    Box1 mareste(int i) {
        Box1 box = new Box1(lungime * i, latime * i, inaltime * i);
        return box;
    }

    Box1 cutiaMare(Box1 box) {
        return new Box1(this.lungime + box.lungime, this.latime + box.latime, this.inaltime + box.inaltime);
    }

//    void copara(Box1 box) {
//        double thisVolume = volume();
//        double boxVolume = box.volume();
//        if (thisVolume > boxVolume) {
//            System.out.println("cutia noastra e mai mare");
//        } else if (thisVolume < boxVolume) {
//            System.out.println("cutia noastra e mai mica");
//        } else {
//            System.out.println("cutiile sunt egale");
//        }

    int copara1(Box1 box) {
        double thisVolume = volume();
        double boxVolume = box.volume();
        if (thisVolume > boxVolume) {
            return 1;
        } else if (thisVolume < boxVolume) {
            return -1;
        } else {
            return 0;
        }
    }
}
