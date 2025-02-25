/**
* @author YOUR NAME here
*/

import java.util.Scanner;

public class BridgeToll520 {
    
    public static void main(String[] args) {
        
        // Start with the following code
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Hours (1-12) => ");
        int h = keyboard.nextInt();

        System.out.print("Minutes (0-59) => ");
        int min = keyboard.nextInt();

        keyboard.nextLine(); // consuming "\n" left in keyboard buffer
 
        System.out.print("am or pm (lower case only) => ");
        String amPm = keyboard.nextLine();

        double toll = -1; // -1 is a placeholder for the actual value to be calculated
        
        System.out.printf("\nTimestamp: %d:%02d %s\nCharge: $%.2f\n", h, min, amPm, toll);
        
        
        
    }
}