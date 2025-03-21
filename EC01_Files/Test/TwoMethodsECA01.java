import java.io.*;
import java.util.Scanner;

/**
* @author Patcharee Catherina Jirakittiyakhon
*/

public class TwoMethodsECA01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        
       // pyramidInFile(5, "NewFile.txt");
       factorsOfTwoInFile("InputFile.txt","NewFile.txt");
 
    }
    /**
     * Reads integers from an input file, factorizes each number into its prime factors (with a focus on powers of two),
     * and writes the results to an output file. The method follows these rules:
     * <ul>
     *   <li>If the input file contains no integers, the output file will contain "No numbers found in the input file."</li>
     *   <li>If a number is zero, it is written as "0 = 0".</li>
     *   <li>If a number is odd, it is written as "{number} = {number}" since odd numbers are not divisible by 2.</li>
     *   <li>For even numbers, the prime factorization is computed and displayed.</li>
     *   <li>Negative numbers are handled correctly, preserving their sign in the output.</li>
     * </ul>
     *
     * @param inputFileName  The name of the input file containing integers.
     * @param outputFileName The name of the output file where the factorized results will be written.
     * @throws IOException If an I/O error occurs while reading or writing the file.
     */

    public static void factorsOfTwoInFile(String inputFileName, String outputFileName)throws IOException
    {
        File inputFile = new File(inputFileName);
        File outputFile = new File(outputFileName);
    
        try (Scanner scanner = new Scanner(inputFile); PrintWriter writer = new PrintWriter(outputFile)) {
            if (!scanner.hasNextInt()) {
                writer.println("No numbers found in the input file.");
                return;
            }
            while(scanner.hasNextInt()){
                int number = scanner.nextInt();
                StringBuilder result = new StringBuilder(number + " = ");
                if(number == 0){
                    writer.println("0 = 0");
                    continue;
                }
                boolean isNegative = number < 0;
                if(isNegative){
                    number =-number;
                }
                if(number % 2 == 1){
                    if(isNegative){
                        writer.println(-number + " = " + -number);
                    }else{
                        writer.println(number + " = " + number);
                    }
                    continue;
                }
                
                for (int i = 2; i <= number; i++) {
                    while (number % i == 0) {
                        number /= i;
                        if(isNegative && number / i == 0){
                            result.append("-");
                        }
                        result.append(i);
                        if (number != 1) {
                            result.append(" * ");
                        }
                    }
                }
                writer.println(result.toString());
            } 
        }
    }
   
     /**
     * Writes a pyramid pattern of asterisks ('*') to a specified file. The pyramid follows these rules:
     * <ul>
     *   <li>If the given size {@code num} is even, only even-numbered rows are printed.</li>
     *   <li>If the given size {@code num} is odd, only odd-numbered rows are printed.</li>
     *   <li>Each row is centered using hyphens ('-') as padding.</li>
     * </ul>
     *
     * @param num      The size of the pyramid. Must be greater than 0.
     * @param fileName The name of the file where the pyramid will be written.
     * @throws IOException              If an I/O error occurs while writing to the file.
     * @throws IllegalArgumentException If {@code num} is less than or equal to 0.
     */
   public static void pyramidInFile(int num, String fileName) throws IOException, IllegalArgumentException
   { 
        if(num <= 0 ) throw new IllegalArgumentException("size must be greater than 0");

        try(PrintWriter writer = new PrintWriter(fileName)){
            for (int i = 1; i <= num; i++) {
                if(num % 2 == 0 && i % 2 == 0){
                    //EVEN
                    int spaces = (num - i) / 2;
                    for(int j = 0; j < spaces; j++) writer.print("-");
                    for(int j = 0; j < i; j++) writer.print("*");
                    for(int j = 0; j < spaces; j ++) writer.print("-");
                    writer.println();

                }else if(num % 2 != 0 && i % 2 != 0){
                    //ODD
                    int spaces = (num - i) / 2;
                    for(int j = 0; j < spaces; j++) writer.print("-");
                    for(int j = 0; j < i; j++) writer.print("*");
                    for(int j = 0; j < spaces; j ++) writer.print("-");
                    writer.println();
                }
            }
        }
   } 
   

    
}
