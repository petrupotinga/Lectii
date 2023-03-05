package OOP.ReincrcareaMetodelor;

public class Monstru {
    int ochi;
    int picioare;
    int miini;

    public Monstru() {
        ochi = 2;
        picioare = 2;
        miini = 2;
        System.out.println("Voce");
    }
    public Monstru(int ochi) {
        this.ochi = ochi;
        picioare = 2;
        miini = 2;
        for (int i = 0; i < ochi; i++) {
            System.out.println("voce");
        }
    }
    public Monstru(int ochi, int miini) {
        this.ochi = ochi;
        this.miini = miini;
        picioare = 2;
    }
    public Monstru(int ochi, int picioare, int miini) {
        this.ochi = ochi;
        this.picioare = picioare;
        this.miini = miini;
    }

}
