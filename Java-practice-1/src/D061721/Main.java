package D061721;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount of leap year cases: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter year: ");
            int year = scan.nextInt();
            System.out.println(Practice.isLeapYear(year));
        }
        // try 2004 T 2100 F 2400 T
        System.out.println("Enter amount of Fibonacci cases: ");
        int m = scan.nextInt();
        for (int k = 0; k < m; k++) {
            System.out.println("\nEnter positive integer: ");
            int pos = scan.nextInt();
            System.out.print(Practice.Fib(pos));
        }
        List<Dog> myDogs = new ArrayList<>();
//        myDogs.add(new Dog("Short", "Rufus"));
//        myDogs.add(new Dog("Long", "Fifo"));
//        myDogs.add(new Dog("Orange", "Holly"));
//        myDogs.add(new Poodle("Curly", "Constant"));
//        myDogs.add(new Poodle("White", "Doodle"));
        System.out.println("\nEnter amount of dogs: ");
        int b = scan.nextInt();
        scan.nextLine();
        for (int l = 0; l < b; l++){
            System.out.println("Enter dog hair: ");
            String dogHair = scan.nextLine();
            System.out.println("Enter dog name: ");
            String dogName = scan.nextLine();
            myDogs.add(new Dog(dogHair, dogName));
        }
            for (Dog dog : myDogs) {
                System.out.println(dog);
                if (dog instanceof Poodle) {
                    System.out.println(((Poodle) dog).dance());
                }
            }

//        	int[] arr = new int[3];
//        	arr[1] = 1;

//        List<Integer> list = new ArrayList<Integer>();
//        list.add(5);
//        list.add(69);
//        list.add(42);
//        list.add(3000);
//        System.out.println(list);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
    }
}
