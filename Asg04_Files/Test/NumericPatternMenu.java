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
        // keyboard.next();
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
    while(true){
      System.out.println("Numeric Pattern Display");
      System.out.println("1. Print Type I pattern (like 12321)");
      System.out.println("2. Print Type II pattern (like 32123)");
      System.out.println("3. Quit");
      int num = validateInt("Enter your choice (1 - 3): \n",scanner);
      if(num == 3) {
        System.out.println("Quitting!");
        return;        
      }
      int size = validateInt("Please enter the size of the pattern. The size must be a positive integer: \n",scanner);
      if(num == 1){
        System.out.println(numericPattern(size, true));
        continue;
      }else if(num == 2){
        System.out.println(numericPattern(size, false));
        continue;
      }
    }
    scanner.close();
  }


}