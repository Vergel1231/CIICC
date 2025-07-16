import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the input string using StringBuilder
        String reversed = new StringBuilder(input).reverse().toString();

        // Check if input and reversed strings are equal
        if (input.equals(reversed)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }

        scanner.close();
    }
}
