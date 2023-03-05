package OOP.ReincrcareaMetodelor;

public class Voice {

    void voice() {
        System.out.println("Voce");
    }

    void voice(int i) {
        for (int j = 0; j < i; j++) {
            System.out.println("voce");
        }
    }

    void voice(int i, String word) {

        for (int j = 0; j < i; j++) {
            System.out.println("word");
        }
    }
}
