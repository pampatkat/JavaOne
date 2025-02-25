
import java.util.Scanner;
/**
 *
 * @author Patcharee Catherina Jirakittiyakhon
 */
public class CircleArea {

    
    public static void main(String[] args) {
      
    
    // ********* Problem 2: Circle Area Problem ***********
    
    // TODO Implement the following step-by-step plan
    
    // 1. Declare double constant PI to hold 3.14
    double PI = 3.14;
    // 2. Declare a double variable to store radius
    double radius = 0;
    // 3. Declare a double variable to store area   
    double area = 0;
    // 4. Prompt the user to enter radius. 
    Scanner scanner = new Scanner(System.in);
    // 5. Input radius and store it in variable
    System.out.printf("Enter Circle radius: ");
    radius = scanner.nextDouble();
    // 6. Calculate circle area. Find the formula on the web if you don't remember it
    area = PI * Math.pow(radius, 2);
    // 7. Output the circle's radius and area values in user-friendly fashion
    System.out.printf("Radius: %.2f \n", radius);
    System.out.printf("Area: %.2f", area);
    // ********* End of Circle Area Problem code area ***********
    scanner.close();
    }
    
}
