/**
* @author Patcharee Catherina Jirakittiyakhon
*/
// import the scanner class
import java.util.Scanner;

public class RestaurantBill 
{
  public static void main(String[] args) { 
  // write your code here
    // create a scanner object
    Scanner scanner = new Scanner(System.in);

    double billAmount;
    double tipPercentage;
    final double tax = 0.1;

    // asking the user for data
    System.out.printf("Enter the bill amount: ");
    billAmount = scanner.nextDouble();
    System.out.printf("Enter the tip percentage: ");
    tipPercentage = scanner.nextDouble();

    // print new line for beauty
    System.out.print("\n");

    // calculating the POstTax, tipAmount and totalBill into its new varible
    double PostTax = billAmount + (tax * billAmount);
    double tipAmount = (tipPercentage/100) * PostTax;
    double totalBill =  PostTax + tipAmount;

    // printing out the results
    System.out.printf("The meal cost is: $%.2f \n", billAmount);
    System.out.printf("The tax amount is: $%.2f \n", tax * billAmount);
    System.out.printf("The tip amount is: $%.2f \n", tipAmount);
    System.out.printf("The total bill is: $%.2f", totalBill);

    // closing the scanner
    scanner.close();
  }   

}

