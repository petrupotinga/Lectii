package OOP.Principii.Mostenirea;

public class Animal {
    public void animalSound() {
        System.out.println("Animalul scoate un sunet");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("Porcul spune: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("Câinele spune: bow wow");
    }
}
