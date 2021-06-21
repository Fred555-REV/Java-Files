package D061921;

import java.util.List;
import java.util.Locale;

public class Display {
    public static void displayProducts(List<Product> productList, String type, int fruitA, int meatA) {

        switch (type.toLowerCase(Locale.ROOT)) {
            case "meat":
            case "m":
                for (int i = 0; i < productList.size() - fruitA; i++) {
                    System.out.println(productList.get(i));
                }
                break;
            case "fruit":
            case "f":
                for (int i = meatA; i < productList.size(); i++) {
                    System.out.println(productList.get(i));
                }
                break;
        }
    }
}
