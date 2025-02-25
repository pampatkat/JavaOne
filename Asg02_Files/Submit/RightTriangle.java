import java.util.*;

/**
* @author Patcharee Catherina Jirakittiyakhon
*/

public class RightTriangle {

    public static void main(String[] args) {
    
        // Start with the following code
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the size of the first side of the triangle => ");
        double a = keyboard.nextDouble();
        if(a <= 0){
            System.out.print("ERROR: Side size must be a positive number! Quitting...");
            System.exit(0);
        }
  
        System.out.print("Enter the size of the second side of the triangle => ");
        double b = keyboard.nextDouble();
        if(b <= 0){
            System.out.print("ERROR: Side size must be a positive number! Quitting...");
            System.exit(0);
        }

        System.out.print("Enter the size of the third side of the triangle => ");
        double c = keyboard.nextDouble();
        if(c <= 0){
            System.out.print("ERROR: Side size must be a positive number! Quitting...");
            System.exit(0);
        }
        double highest, secondHighest, thirdHighest;
        
        if(a >= b && a >= c){
            highest = a;
        }else if(b >= a && b >= c){
            highest = b;
        }else{
            highest = c;
        }
        // Find the second highest value
        if ((a >= b && a <= c) || (a >= c && a <= b)) {
            secondHighest = a;
        } else if ((b >= a && b <= c) || (b >= c && b <= a)) {
            secondHighest = b;
        } else {
            secondHighest = c;
        }

        // Find the third highest value
        if (a <= b && a <= c) {
            thirdHighest = a;
        } else if (b <= a && b <= c) {
            thirdHighest = b;
        } else {
            thirdHighest = c;
        }
        // System.out.printf("This is HIGHEST: %d \n", highest);
        // System.out.printf("This is SecondHIGHEST: %d \n", secondHighest);
        // System.out.printf("This is ThirdHIGHEST: %d \n", thirdHighest);

        double HIGHEST = Math.pow(highest,2);
        double SECONDHIGHEST = Math.pow(secondHighest,2);
        double THIRDHIGHEST = Math.pow(thirdHighest,2);
        
        // System.out.printf("This is HIGHEST: %.1f \n", HIGHEST);
        // System.out.printf("This is SecondHIGHEST: %.1f \n", SECONDHIGHEST);
        // System.out.printf("This is ThirdHIGHEST: %.1f \n", THIRDHIGHEST);

        if(HIGHEST == (SECONDHIGHEST + THIRDHIGHEST)){
            System.out.printf("This is a RIGHT triangle because %d.0^2 = %d.0^2 + %d.0^2",highest,thirdHighest,secondHighest);
        }else{
            System.out.print("This is NOT a right triangle.");
        }
        keyboard.close();

    }

}
