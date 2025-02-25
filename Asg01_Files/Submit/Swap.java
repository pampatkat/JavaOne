
import java.util.Scanner;
/**
 *
 * @author Patcharee Catherina Jirakittiyakhon
 */
public class Swap {

    
    public static void main(String[] args) {
    
    //******** Problem 1: Logic Problem ********************
    // TODO This program has a logical error. Your goal is to fix it. 
    
    double firstNumber; // to hold the first number
    double secondNumber; // to hold the second number
    // create scanner object to read input
    Scanner keyboard = new Scanner(System.in); 
	
    // Prompt user to enter the first number.
    System.out.print("Enter the first number:");
    // input the first number
    firstNumber = keyboard.nextDouble();
    
    // Promt user to enter the second number.
    System.out.print("Enter the second number:");
    // input the second number
    secondNumber = keyboard.nextDouble();       
    
    // Echo print the input.
    System.out.println("You input the numbers as "+ firstNumber+" and " + secondNumber );
    
    // Now we will swap the values.	
    firstNumber = secondNumber;
    secondNumber = firstNumber;
      
    // Output the values.
    System.out.println("After swapping, the values of the two numbers are "+ firstNumber+" and " + secondNumber );
	
    keyboard.close();
    }
    
}
