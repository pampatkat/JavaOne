/**
* @author Patcharee Catherina Jirakittiyakhon
*/

// import the scanner class
import java.util.Scanner;

 public class InterestEarned 
 {
     public static void main(String[] args) { 
     // write your code here

     // create vaiebles
     double principal;
     double Rate;
     double T;
     
     // create a scanner object
     Scanner scanner = new Scanner(System.in);

     // ask user for data 
     System.out.printf("Enter the principal balance: ");
     // input user data into the scanner to the desire variable
     principal = scanner.nextDouble();
     System.out.printf("Enter the percent interest rate as a percentage value: ");
     Rate = scanner.nextDouble();
     System.out.printf("Enter the times compounded per year: ");
     T = scanner.nextDouble();

     // print a new line for beauty
     System.out.print("\n");

     // print out the data that are stored for the user to see
     System.out.printf("Interest rate: %.2f%%\n", Rate);
     System.out.printf("Times compounded: %.0f\n", T);
     System.out.printf("Principal: $%.1f\n", principal);

     // calculating the interest and totalSaving into its varibles
     double interest = principal * Math.pow((1 + Rate / 100 / T), T) - principal;
     double totalSavings = principal + interest;
     // printing out the calculations
     System.out.printf("Interest: $%.2f\n", interest);
     System.out.printf("Amount in savings: $%.2f\n", totalSavings);

     scanner.close();
    }  
 }

