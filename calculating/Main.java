package D061521;

class Calc {
    public static int sumTotal(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
            if (i != n) {
                System.out.print(i + " + ");
            } else {
                System.out.print(n);
            }
        }
        System.out.print(" = ");
        return total;
    }

    //    public static int sumTotal(int n) {
//        int total = 0, i = 0;
////        total = i = 0;
//        while (i <= n) {
//            total += i++;
//        }
//        return total;
//    }
//
    public static int sumEvens(int n) {
        // sum all even number(s) from 2 to n
        // to test if even n % 2 == 0
        int total = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                total += i;
            }
            if (n % 2 == 0 && i % 2 == 0 && i != n) {
                System.out.print(i + " + ");
            } else if (n % 2 == 0 && i == n) {
                System.out.print(n);
            }
            if (n % 2 != 0 && i % 2 == 0) {
                System.out.print(i);
            } else if (n % 2 != 0 && i != 1 && i < n) {
                System.out.print(" + ");
            }
        }
        System.out.print(" = ");
        return total;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println(Calc.sumTotal(5));
        System.out.println(Calc.sumTotal(1));
        System.out.println(Calc.sumTotal(14));
        System.out.println(Calc.sumEvens(2));
        System.out.println(Calc.sumEvens(16));
        System.out.println(Calc.sumEvens(7));
        System.out.println(Calc.sumEvens(11));
    }
}
