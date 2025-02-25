import java.util.Scanner;

/**
* @author Patcharee Jirakittiyakhon
*/


public class GreatestAndLeast {
    public static void main(String[] args) {
    // write your code here
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE; // Initialize to smallest possible integer
        int smallest = Integer.MAX_VALUE; // Initialize to largest possible integer
        boolean hasNumbers = false; // Flag to check if any valid numbers were entered

        System.out.println("Enter a positive integer number. Enter -99 to stop input.");

        while (true) {
            System.out.print("=> ");
            int number = scanner.nextInt();

            // Check if the user wants to stop
            if (number == -99) {
                break;
            }

            // Reject negative numbers other than -99
            if (number < 0) {
                System.out.println("ERROR: negative integers other than -99 are not allowed.");
                continue;
            }

            // Update largest and smallest numbers
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }

            // Mark that at least one valid number was entered
            hasNumbers = true;
        }

        // Display results based on whether any numbers were entered
        if (!hasNumbers) {
            System.out.println("No numbers were entered");
        } else {
            System.out.println("the largest number: " + largest + " ; the smallest number: " + smallest);
        }

        scanner.close();
    }
}
