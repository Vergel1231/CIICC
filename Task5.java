import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            System.out.print("Enter third number: ");
            int num3 = scanner.nextInt();

            if (num1 == num2 && num2 == num3) {
                System.out.println("All numbers are equal.");
            } else if (num1 >= num2 && num1 >= num3) {
                System.out.println("The largest number is: " + num1);
            } else if (num2 >= num1 && num2 >= num3) {
                System.out.println("The largest number is: " + num2);
            } else {
                System.out.println("The largest number is: " + num3);
            }
        }
    }
}
// This code takes three integers as input and determines the largest among them or if they are all equal.