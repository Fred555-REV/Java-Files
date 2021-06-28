class Bird {
    int wings = 2;
    int legs = 2;
    int limbs = wings + legs;
    public String featherColor;

    public Bird(String featherColor) {

        this.featherColor = featherColor;
    }

    public Bird() {
    }

    public int getWings() {

        return wings;
    }

    public int getLimbs() {
        return limbs;
    }

    public void sound() {
        System.out.println("Flap!");
    }

}

class Penguin extends Bird {
    public Penguin(String featherColor) {
        super(featherColor);
    }

    public void sound() {
        System.out.println("Splash!");
    }

    public String toString() {
        return "This penguin has " + getWings() + " wings and " + featherColor + " down feathers.";
    }
}

class Vulture extends Bird {
    public Vulture(String featherColor) {
        super(featherColor);
    }

    public String toString() {
        return "This vulture has " + getLimbs() + " limbs and " + featherColor + " wing feathers.";
    }
}

public class Main {

    public static void main(String[] args) {
//        System.out.println("Freddy was here");
        Bird randomBird = new Bird();
        randomBird.sound();
        System.out.println("There seems to be a bird somewhere around here.");
        Penguin Empoleon = new Penguin("navy");
        Empoleon.sound();
        System.out.println("Here comes Empoleon!");
        System.out.println(Empoleon.toString());
        Vulture Moltres = new Vulture("orange");
        Moltres.sound();
        System.out.println("Here comes Moltres!");
        System.out.println(Moltres.toString());
    }
}
