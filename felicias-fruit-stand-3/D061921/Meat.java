package D061921;

import java.util.List;

public class Meat extends Product {
    public String cut;
    public boolean isCooked;

    public Meat(String name, int amount, int price, int weight, String cut, boolean isCooked) {
        super(name, amount, price, weight);
        this.cut = cut;
        this.isCooked = isCooked;
    }

    public String toString() {
        String cooked = "";
        if (isCooked) {
            cooked = "cooked";
        } else {
            cooked = "raw";
        }
        if (amount > 1 || amount == 0) {
            return "There are " + amount + " " + cooked + " " + name + " " + cut + "s that weigh a total of " + weight + " pounds, they each cost $" + price + ".";
        } else if (amount == 1) {
            return "There is " + amount + " " + cooked + " " + name + " " + cut + " that weighs " + weight + " pounds, it costs $" + price + ".";
        }
        return "ERR negative amount";
    }
}
