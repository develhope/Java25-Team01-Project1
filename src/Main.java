public class Main {

    public static void main(String[] args) {

    }

    // Method of sum
    public static double sumValues (double x, double y) {
        return x + y;
    }
    // Method of subtraction
    public static double subValues (double x, double y) {
        return x - y;
    }
    // Method of Multiplication
    public static double MoltValues(double x , double y) {
        return x * y;
    }
    // Method of Division
    public static double divValues (double x, double y) {
        return x / y;
    }

    //Method Even values
    public static String evenValues (double x, double y) {
        double sum = x + y;
        if (sum % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    //Method exponential values
    public static double exponentialValues (double x, double y) {
        double result = 1.0;
        for (int i=0; i < y; i++) {
            result *= x;
        }
        return result;
    }
}