import java.util.Random;
import java.util.Scanner;

/**
* @author Patcharee Catherina Jirakittiyakhon
*/


 public class MathTutor
 {
     public static void main(String[] args) { 
     // write your code here
        Scanner scanner = new Scanner(System.in);

        Random rand = new Random();
        while(true){
            System.out.println("Math Tutor");
            System.out.println("1. Addition problem");
            System.out.println("2. Subtraction problem");
            System.out.println("3. Quit");
            System.out.print("Enter your choice (1 - 3): ");

            int choice = scanner.nextInt();
            // If the user enter number of choice out of range (1-3) continue loop
            if(choice < 1 || choice > 3){
                System.out.println("ERROR: Invalid choice");
                continue;
            }
            // When the user choice to quit the program
            if(choice == 3){
                System.out.println("Goodbye!");
                break;
            }

            int num1 = rand.nextInt(999)+0;
            int num2 = rand.nextInt(999)+0;
            
            // We want num1 to have th largest value. If num2 have more value than num1 we which the value
            if(num2 > num1){
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

            int correctAnswer = 0;
            if(choice == 1){
                System.out.printf("%5d\n", num1);
                System.out.printf("+%4d\n", num2);
                System.out.println("----");
                correctAnswer = num1 + num2;
            }else if(choice == 2){
                System.out.printf("%5d\n", num1);
                System.out.printf("-%4d\n", num2);
                System.out.println("----");
                correctAnswer = num1 - num2;
            }
            
            System.out.print("Enter your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Correct! Well done.");
                System.out.println("");
            } else {
                System.out.printf("Incorrect. The correct answer is %d.\n", correctAnswer);
                System.out.println("");
            }

        }
        
        scanner.close();
    }  
 }