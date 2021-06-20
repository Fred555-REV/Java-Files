package D061921;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FruitStand {

    public static void main(String[] args) {
        // write your code here
        List productList = new ArrayList();
        List meatList = new ArrayList();
        List fruitList = new ArrayList();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter amount of different meats: ");
        int meatAmount = scan.nextInt();
        scan.nextLine();

        for (int p = 0; p < meatAmount; p++) {
            System.out.println("Enter meat name: ");
            String name = scan.nextLine();
            int amount = (int) (Math.random() * 10) + 2;
            int price = (int) (Math.random() * 10) + 1;
            int weight = (int) (Math.random() * 5) + 2;
            System.out.println("Enter meat cut: ");
            String cut = scan.nextLine();
            System.out.println("Is the meat cooked? Enter: true/false ");
            boolean isCooked = scan.nextBoolean();
            scan.nextLine();
            productList.add(new Meat(name, amount, price, weight, cut, isCooked));
//            meatList.add(new Meat(name, amount, price, weight, cut, isCooked));
        }

        System.out.println("Enter amount of different fruits: ");
        int fruitAmount = scan.nextInt();
        scan.nextLine();

        for (int o = 0; o < fruitAmount; o++) {
            System.out.println("Enter fruit name: ");
            String name = scan.nextLine();
            int amount = (int) (Math.random() * 10) + 2;
            int price = (int) (Math.random() * 10) + 1;
            int weight = (int) (Math.random() * 5) + 2;
            System.out.println("Enter fruit color: ");
            String color = scan.nextLine();
            System.out.println("Enter fruit size: small/medium/large");
            String size = scan.nextLine();
            productList.add(new Fruit(name, amount, price, weight, color, size));
//            fruitList.add(new Fruit(name, amount, price, weight, color, size));
        }
//        System.out.println(meatList);
//        System.out.println(fruitList);
//        System.out.println(productList); First Try!!!!

        displayProducts(productList);

        System.out.println("Enter product type: ");
        String productType = scan.nextLine();

        displayProductsOfType(productList, productType, fruitAmount, meatAmount);

        System.out.println("Enter index: ");
        int indexI = scan.nextInt();
        displayProduct(productList, indexI);
        scan.close();
    }

    public static void displayProducts(List productList) {
        for (Object o : productList) {
            System.out.println(o);
        }
    }

    public static void displayProductsOfType(List productList, String type, int fruitA, int meatA) {

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

    public static void displayProduct(List productList, int indexI) {
        System.out.println(productList.get(indexI));
    }

}
/*
imputs that I use for testing

3
Chicken
breast
false
beef
round
true
Pork
shoulder
true
3
Banana
yellow
medium
Orange
orange
small
Watermelon
green
large
meat
4

*/
