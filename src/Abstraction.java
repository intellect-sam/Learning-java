abstract class Animal {

    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }
}

class Pog extends Animal {
    public void animalSound() {
        System.out.println("This pig says: wee wee");
    }
}

/**
 * Abstraction
 */
class Abstraction {

    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}