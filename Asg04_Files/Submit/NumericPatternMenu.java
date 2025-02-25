import java.util.Scanner;

/**
* @author Patcharee Catherina Jirakittiyakhon
*/


public class NumericPatternMenu {
  public static int validateInt(String prompt, Scanner keyboard){
    int num = 0;
    while(true){
      System.out.print(prompt);
      if(keyboard.hasNextInt()){
        num = keyboard.nextInt();
        break;
      }else{
        System.out.println("ERROR. Number entered is not an integer.");
        keyboard.next();
      }
    }
    return num;
  }
    
  public static String numericPattern(int size, boolean direction) throws IllegalArgumentException{
    if(size <= 0){
      throw new IllegalArgumentException("Size must be greater than 0");
    }
    String result = "";
    if(direction == true){
      for(int i = 1; i < size; i++){
        result += i;
      }
      for(int i = size; i > 0; i--){
        result += i;
      }
    }else if(direction == false){
      for(int i = size; i > 1; i--){
        result += i;
      }
      for(int i = 1; i <= size ; i++){
        result += i;
      }
    }
    return result;
  }

    
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int num1 = validateInt("Please enter the first number => ", scanner);
    int num2 = validateInt("Please enter the second number => ", scanner);      
    System.out.printf("Thank you! first number is %d, second number is %d.", num1, num2);
    scanner.close();
  }


}