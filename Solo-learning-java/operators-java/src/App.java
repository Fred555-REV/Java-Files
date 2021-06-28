public class App {
    public static void main(String[] args) throws Exception {
        float x = 5;
        int y = 7;
        float z = 56;
        float addition = x + y + z;
        float subtraction = z - (float)y - x;
        float multiplication = x * (float)y;
        float division = z / (float)y;
        float bracketMath = z/((float)y*x);
        double exponent = Math.pow(x, (float)y);
        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(bracketMath);
        System.out.println(exponent);
    }
}
