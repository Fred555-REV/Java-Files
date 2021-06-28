package D061721;

class Practice {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static int Fib(int pos) {
        int fib = 0;
        int first = 0;
        int second = 1;

//        if (pos <= 1) {
//            return pos;
//        } else if (pos>1){
//            return Fib(pos - 1) + Fib(pos - 2);
//        } else {
//        return "ERR only input positive integers"
//        }
        if (pos < 0) {
            System.out.println("I SAID POSITIVE INTEGER!!!");
        } else if (pos <= 2) {
            fib = 1;
        }
        for (int j = 2; j <= pos; j++) {
            fib = first + second;
            if (j < pos - 1 && pos > 2) {
                System.out.print(first + " + " + second + " + ");
            } else if (j < pos) {
                System.out.print(first + " + " + second);
            } else if (pos > 2) {
                System.out.print(" = ");
            }
            first = second;
            second = fib;
//            System.out.println(fib);
        }
        return fib;

    }
}
