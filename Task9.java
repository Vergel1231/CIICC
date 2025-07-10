import static java.lang.Math.*;

public class Task9 {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static int divide(int a, int b) {
        return floorDiv(a, b); // Integer division
    }

    public static void main(String[] args) {
        int a = 15, b = 4;

        int sum = add(a, b);
        int difference = subtract(a, b);
        int product = multiply(a, b);
        int quotient = divide(a, b);

        System.out.println("Using values: a = " + a + ", b = " + b);
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division (floor): " + quotient);
    }
}
