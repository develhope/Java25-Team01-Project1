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
    public static String evenValues (double x, double y) {
        double sum = x + y;
        if (sum % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}