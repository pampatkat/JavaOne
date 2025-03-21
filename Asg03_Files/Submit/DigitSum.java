import java.util.*;
/**
* @author Patcharee Jirakittiyakhon
*/

public class DigitSum {

	public static void main(String[] args) {
      // start witht he following code. Add your code to solve the problem
      
      Scanner scanner = new Scanner(System.in);
      int number = 0;
      boolean validInput = false;

      // Loop until a valid integer is entered
      while (!validInput) {
          System.out.print("Enter an integer => ");
          String input = scanner.nextLine();

          try {
              // Attempt to parse the input as an integer
              number = Integer.parseInt(input);
              validInput = true; // Input is valid, exit the loop
          } catch (NumberFormatException e) {
              // Input is not a valid integer, display error message
              System.out.println("Input ERROR. Number entered was not an integer.");
          }
      }

      // Calculate the sum of the digits
      int sum = 0;
      int tempNumber = Math.abs(number); // Use absolute value to handle negative numbers

      while (tempNumber > 0) {
          sum += tempNumber % 10; // Add the last digit to the sum
          tempNumber /= 10; // Remove the last digit
      }

      // Print the result
      System.out.println("You entered number " + number + ". The sum of its digits is " + sum);

	}

}
