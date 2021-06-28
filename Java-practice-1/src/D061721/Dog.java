package D061721;

public class Dog {
    public String name;
    public int legs = 4;
    public String hair;

    public Dog(String hair, String name) {
        this.hair = hair;
        this.name = name;
    }
    public String speak() {
        return "A-Woof";
    }
    public String toString() {
        return name + " has " + hair + " hair,and " + legs + " legs, and is a good dog.";
    }
}
