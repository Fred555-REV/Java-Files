package D061921;

import java.util.ArrayList;
import java.util.List;

public class Product {
    public String name;
    public int amount;
    public int price;
    public int weight;

    public Product(String name, int amount, int price, int weight) {
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.weight = weight;
    }

    public String toString() {
        if (amount > 1 || amount == 0) {
            return "There are " + amount + " " + name + "s that weigh a total of " + weight + " pounds, they each cost $" + price + ".";
        } else if (amount == 1) {
            return "There is " + amount + " " + name + " that weighs " + weight + " pounds, it costs $" + price + ".";
        }
        return "ERR negative amount";
    }
}
