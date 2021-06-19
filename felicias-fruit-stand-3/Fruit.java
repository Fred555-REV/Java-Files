package D061921;

import java.security.PublicKey;
import java.util.List;

public class Fruit extends Product {
    public String color;
    public String size;

    public Fruit(String name, int amount, int price, int weight, String color, String size) {
        super(name, amount, price, weight);
        this.color = color;
        this.size = size;
    }

    public String toString() {
        if (amount > 1 || amount == 0) {
            return "There are " + amount + " " + size + " " + color + " " + name + "s that weigh a total of " + weight + " pounds, they each cost $" + price + " each.";
        } else if (amount == 1) {
            return "There is " + amount + " " + size + " " + color + " "+ name + " that weighs " + weight + " pounds, it costs $" + price;
        }
        return "ERR negative amount";
    }
}
