package D061921;

import java.util.List;

public class Display {
    public static void displayProducts(List<Product> productList, String type, int fruitA, int meatA) {

        switch (type) {
            case "meat":
                for (int i = 0; i < productList.size() - fruitA; i++) {
                    System.out.println(productList.get(i));
                }
                break;
            case "fruit":
                for (int i = meatA; i < productList.size(); i++) {
                    System.out.println(productList.get(i));
                }
                break;
        }
    }
}
