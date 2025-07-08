public class OddEvenLoop {
    public static void main(String[] args) {
        int check_number = 10; // Step 1: Initialize int variable
        String message;        // Step 2: Declare String variable

        // Step 3: Loop up to check_number
        for (int i = 1; i <= check_number; i++) {
            // Step 4: Use ternary operator to determine odd or even
            message = (i % 2 == 0) ? i + " is even number" : i + " is odd number";
            // Step 5: Print the message
            System.out.println(message);
        }
    }
}
// This code initializes an integer variable, loops through numbers from 1 to that integer,