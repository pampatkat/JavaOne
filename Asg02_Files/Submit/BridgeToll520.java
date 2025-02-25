import java.util.Scanner;
/**
* @author Patcharee Catherina Jirakittiyakhon
*/

public class BridgeToll520 {
    
    public static void main(String[] args) {
        
        // Start with the following code
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Hours (1-12) => ");
        int h = keyboard.nextInt();
        if(h <= 0 || h > 12){
            System.out.print("ERROR: Hours value is out of [1, 12] range! Quitting...");
            System.exit(0);
        }
        
        System.out.print("Minutes (0-59) => ");
        int m = keyboard.nextInt();
        if(m < -1 || m > 59){
            System.out.print("ERROR: Minutes value is out of [0, 59] range! Quitting...");
            System.exit(0);
        }
        
        keyboard.nextLine(); // consuming "\n" left in keyboard buffer
 
        System.out.print("am or pm (lower case only) => ");
        String amPm = keyboard.nextLine();

        double toll = -1; // -1 is a placeholder for the actual value to be calculated

        if(!amPm.equals("am") && !amPm.equals("pm")){
            System.out.println("ERROR: Invalid string. Must be either \"am\" or \"pm\". Quitting...");
            System.exit(0);
        }else{
            System.out.printf("\nTimestamp: %d:%02d %s\n", h, m, amPm);
        }
        
        // convert to military time
        int result = h * 100 + m;
        
        if(amPm.equals("pm")){
            result += 1200;
        }else if (amPm.equals("am") && h == 12) {
            result = 0;
        }
        
        if(result >= 0000 && result <= 459) {
            System.out.println("Charge: $1.25");
        }else if(result >= 500 && result <= 759){
            System.out.println("Charge: $1.40");
        }else if(result >= 800 && result <= 1059){
            System.out.println("Charge: $2.05");
        }else if(result >= 1100 && result <= 1759){
            System.out.println("Charge: $2.65");
        }else if(result >= 1800 && result <= 2059){
            System.out.println("Charge: $2.05");
        }else if(result >= 2100 && result <= 2259){
            System.out.println("Charge: $1.40");
        }else if(result >= 2300 && result <= 2359){
            System.out.println("Charge: $1.25");
        }
        keyboard.close();
    }
}