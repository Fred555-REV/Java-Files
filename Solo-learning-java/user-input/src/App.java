import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String scanned = sc.next();
        System.out.println(scanned);
        sc.close();
        // takes User input as a string saves it to a variable and outputs as a string
        int x = Integer.parseInt(scanned); // transforms the saved input "scanned" into an integer and saves it as
                                           // another variable
        System.out.println(x);
        // outputs the saved transformed integer or outputs an error if the string saved
        // could not be transformed to an integer

        Scanner scInt = new Scanner(System.in);
        int scannedInt = scInt.nextInt();
        System.out.println(scannedInt);
        scInt.close();
        // takes User input as an integer saves it to a variable and outputs as an
        // integer

        Scanner scBoolean = new Scanner(System.in);
        boolean scannedBoolean = scBoolean.nextBoolean();
        System.out.println(scannedBoolean);
        scBoolean.close();
        // takes User input as a boolean saves it to a variable and outputs as a boolean

        Scanner scDouble = new Scanner(System.in);
        double scannedDouble = scDouble.nextDouble();
        System.out.println(scannedDouble);
        scDouble.close();
        // takes User input as a double saves it to a variable and outputs as a double
    }
}
