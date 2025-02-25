import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
* @author Patcharee Jirakittiyakhon
*/

public class RandomsInFile {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0, max = 0;
        boolean validMin = false, validMax = false;

        // Input validation for minimum value
        while (!validMin) {
            System.out.print("Enter the minimum value as a positive integer: ");
            try {
                min = Integer.parseInt(scanner.nextLine());
                if (min < 0) {
                    System.out.println("Input ERROR. Number entered was not positive.");
                } else {
                    validMin = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input ERROR. Number entered was not an integer.");
            }
        }

        // Input validation for maximum value
        while (!validMax) {
            System.out.print("Enter the maximum value as a positive integer: ");
            try {
                max = Integer.parseInt(scanner.nextLine());
                if (max < 0) {
                    System.out.println("Input ERROR. Number entered was not positive.");
                } else {
                    validMax = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input ERROR. Number entered was not an integer.");
            }
        }

        // Ensure min is less than max
        if (min > max) {
            System.out.println("Swapping min and max values since min > max.");
            int temp = min;
            min = max;
            max = temp;
        }

        // Ask for the filename
        System.out.print("Enter the filename to write into: ");
        String filename = scanner.nextLine();

        // Generate random numbers and write to file
        try (FileWriter writer = new FileWriter(filename)) {
            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                int randomNumber = random.nextInt((max - min) + 1) + min;
                writer.write(randomNumber + "\n");
            }
            System.out.println("Data written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}

