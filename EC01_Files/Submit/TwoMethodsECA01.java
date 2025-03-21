import java.io.*;
import java.util.Scanner;

/**
* @author Patcharee Catherina Jirakittiyakhon
*/

public class TwoMethodsECA01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        testPyramidInFile();
        testFactorsOfTwoInFile();
 
    }
    
    public static void factorsOfTwoInFile(String inputFileName, String outputFileName)throws IOException
    {
        
    }
   
     
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
                    // int mid = (i + 1) / 2;
                    
                    // if(i <= mid){
                    //     //Print spaces "_"
                    //     for(int j = 0; j < mid; j-- ){
                    //         writer.print("-");      
                    //     }
                    //     //Print stars
                    //     for(int j = 0; j < (2 * i - 1); j++){
                    //         writer.print("*");
                    //     }
                    //     //Print tailing spaces
                    //     for(int j = 0; j < mid = i; j++){
                    //         writer.print("-");
                    //     }
                    // }else{
                    //     for(int j = 0; j < num; j++){
                    //         writer.print("*");
                    //     }
                    // }
                        

                }else if(num % 2 != 0 && i % 2 != 0){
                    //ODD
                    int spaces = (num - i) / 2;
                    for(int j = 0; j < spaces; j++) writer.print("-");
                    for(int j = 0; j < i; j++) writer.print("*");
                    for(int j = 0; j < spaces; j ++) writer.print("-");
                }
                // int stars = (i % 2 == 1) ? (2 * i - 1) : (2 * i);
                // int spaces = (num * 2 - 1 - stars) / 2;
                
                // writer.write(" ".repeat(spaces) + "*".repeat(stars) + "\n");
            }
        }
   } 
   
    /**
    * Method runs all test cases for pyramidInFile() method 
    */
   public static void testPyramidInFile()
   {
	   System.out.println("\r\n----pyramidInFile() Tests------------------------------------------------------------\r\n");
       String[] test1 = new String[1]; // pattern of size 1
       test1[0] = "*";
       String[] test2 = new String[1]; // pattern of size 2
       test2[0] = "**";
       String[] test3 = new String[2]; // pattern of size 3
       test3[0] = "-*-";
       test3[1] = "***";      
        String[] test4 = new String[2]; // pattern of size 4
       test4[0] = "-**-";
       test4[1] = "****";      
       String[] test5 = new String[3]; // pattern of size 5
       test5[0] = "--*--";
       test5[1] = "-***-";
       test5[2] = "*****";
       String[] test8 = new String[4]; // pattern of size 8
       test8[0] = "---**---";
       test8[1] = "--****--";
       test8[2] = "-******-";
       test8[3] = "********";   
       
       // Building test files
       try
       {
           buildTestFile("testCase1.txt", test1);
           buildTestFile("testCase2.txt", test2);
           buildTestFile("testCase3.txt", test3);
           buildTestFile("testCase4.txt", test4);
           buildTestFile("testCase5.txt", test5);
           buildTestFile("testCase8.txt", test8);
       }
       catch(IOException e)
       {
           System.out.println("IO trouble with creating test files");
       }
       
       try{
            //--- Test 1 ---//      
            pyramidInFile(1, "test01.txt"); 
            if(areEqualFiles("test01.txt", "testCase1.txt")) {
            	System.out.printf("%-80s%-10s\n", "pyramidInFile() TEST 01 - pattern of size 1",  "PASSED");
            }
            else {
            	System.out.printf("%-80s%-10s\n", "pyramidInFile() TEST 01 - pattern of size 1",  "FAILED");
            }

            //--- Test 2 ---//
            pyramidInFile(2, "test02.txt"); 
            if(areEqualFiles("test02.txt", "testCase2.txt")) {
            	System.out.printf("%-80s%-10s\n", "pyramidInFile() TEST 02 - pattern of size 2",  "PASSED");
            }
            else {
            	System.out.printf("%-80s%-10s\n", "pyramidInFile() TEST 02 - pattern of size 2",  "FAILED");
            }

            //--- Test 3 ---//
            pyramidInFile(3, "test03.txt"); 
            if(areEqualFiles("test03.txt", "testCase3.txt")) {
            	System.out.printf("%-80s%-10s\n", "pyramidInFile() TEST 03 - pattern of size 3",  "PASSED");
            }
            else {
            	System.out.printf("%-80s%-10s\n", "pyramidInFile() TEST 03 - pattern of size 3",  "FAILED");
            }

            //--- Test 4 ---//
            pyramidInFile(4, "test04.txt"); 
            if(areEqualFiles("test04.txt", "testCase4.txt")) {
            	System.out.printf("%-80s%-10s\n", "pyramidInFile() TEST 04 - pattern of size 4",  "PASSED");
            }
            else {
            	System.out.printf("%-80s%-10s\n", "pyramidInFile() TEST 04 - pattern of size 4",  "FAILED");
            }

            //--- Test 5 ---//
            pyramidInFile(5, "test05.txt"); 
            if(areEqualFiles("test05.txt", "testCase5.txt")) {
            	System.out.printf("%-80s%-10s\n", "pyramidInFile() TEST 05 - pattern of size 5",  "PASSED");
            }
            else {
            	System.out.printf("%-80s%-10s\n", "pyramidInFile() TEST 05 - pattern of size 5",  "FAILED");
            }

            //--- Test 6 ---//
            pyramidInFile(8, "test08.txt"); 
            if(areEqualFiles("test08.txt", "testCase8.txt")) {
            	System.out.printf("%-80s%-10s\n", "pyramidInFile() TEST 06 - pattern of size 8",  "PASSED");
            }
            else {
            	System.out.printf("%-80s%-10s\n", "pyramidInFile() TEST 06 - pattern of size 8",  "FAILED");
            }

            //--- Test 7 ---//    
            // Test on exception(s) that your method is supposed to throw
            try {
	            pyramidInFile(-8, "test07.txt");
	            System.out.printf("%-80s%-10s\n", "pyramidInFile() TEST 07 - IllegalArgumentException, negative parameter",  "FAILED");
	       }
	       catch(IllegalArgumentException e)
	       {
	    	   System.out.printf("%-80s%-10s\n", "pyramidInFile() TEST 07 - IllegalArgumentException, negative parameter",  "PASSED");
	       }
            //--- Test 8 ---//    
            // Test on IOException that your method is supposed to throw
            try {
	            pyramidInFile(8, "a\\test07.txt");
	            System.out.printf("%-80s%-10s\n", "pyramidInFile() TEST 08 - IOException",  "FAILED");
            }
            catch(IOException e)
            {
            	System.out.printf("%-80s%-10s\n", "pyramidInFile() TEST 08 - IOException",  "PASSED");
            }

       }
       catch(IOException e)
       {
    	   System.out.printf("FAIL: Unexpected IOException. pyramidInFile() may not be implemented yet");
       }
               
   }

     /**
      * This method tests powersOfTwoInFile() method
      * Two sets of files are automatically generated:
      * testCaseIn.txt files are used as input file for powersOfTwoInFile()
      * testCaseOut.txt contain the expected result that must be generated by powersOfTwoInFile()
      */
     public static void testFactorsOfTwoInFile()
     {
    	 System.out.println("\r\n----powersOfTwoInFile() Tests------------------------------------------------------------\r\n");
        Integer[] testIn1 = {};
        String[] testOut1 = {"No numbers found in the input file."};
        Integer[] testIn2 = {0, 1, 2, 3, 12, 58, 128, -15, -34};
        String[] testOut2 = {"0 = 0", "1 = 1", "2 = 2", "3 = 3", "12 = 2 * 2 * 3", "58 = 2 * 29", "128 = 2 * 2 * 2 * 2 * 2 * 2 * 2", "-15 = -15", "-34 = 2 * -17"};
       
        // generating test files
        
        try
        {
            buildTestFile("testCaseIn01.txt", testIn1); // build an emty file
            buildTestFile("testCaseOut01.txt", testOut1);
            buildTestFile("testCaseIn02.txt", testIn2); // build file with input test values
            buildTestFile("testCaseOut02.txt", testOut2); // build test file with expected results                      
        }
        catch(IOException e)
        {
             System.out.println("Trouble with file IO when generating tets files; "+e.getMessage());
        }
        
        try
        {
            //--- Test 1 ---//
            // Test for empty input file
            factorsOfTwoInFile("testCaseIn01.txt", "test01.txt");
            if(areEqualFiles("test01.txt", "testCaseOut01.txt")) {
            	System.out.printf("%-80s%-10s\n", "powersOfTwoInFile() TEST 01 - empty input file",  "PASSED");
            }
            else {
            	System.out.printf("%-80s%-10s\n", "powersOfTwoInFile() TEST 01 - empty input file",  "FAILED");  
            }
            
            //--- Test 2 ---//
            // test for all other cases
            factorsOfTwoInFile("testCaseIn02.txt", "test02.txt"); // call on your method
            if(areEqualFiles("test02.txt", "testCaseOut02.txt")) {
            	System.out.printf("%-80s%-10s\n", "powersOfTwoInFile() TEST 02 - general case, mixed values in file",  "PASSED");
            }
            else {
            	System.out.printf("%-80s%-10s\n", "powersOfTwoInFile() TEST 02 - general case, mixed values in file",  "FAILED");            
            }
 
            //--- Test 3 ---//
            // Test on IO exception(s) your method is supposed to throw
            try {
            factorsOfTwoInFile("doesNotExist.txt", "test03.txt"); 
            System.out.printf("%-80s%-10s\n", "powersOfTwoInFile() TEST 03 - IOException",  "FAILED");  
            }
	        catch(FileNotFoundException e)
	        {
	        	System.out.printf("%-80s%-10s\n", "powersOfTwoInFile() TEST 03 - IOException",  "PASSED");  
	        }
        }
        catch(IOException e)
        {
        	System.out.printf("FAIL: Unexpected IOException. powersOfTwoInFile() may not be implemented yet");
        }
     }
     
      /**
    * Compares content of two files and returns true if content is identical, false if not
    * @param fileName1 name of first file to be compared
    * @param fileName2 name of second file to be compared
    * @return true if the files are identical, false if not
    * @throws IOException thrown when files fail to open for reading / writing
    */
   public static boolean areEqualFiles(String fileName1, String fileName2) throws IOException
   {
        FileReader file1 = new FileReader(fileName1); 
        FileReader file2 = new FileReader(fileName2); 
        Scanner input1 = new Scanner(file1);
        Scanner input2 = new Scanner(file2);
        while(input1.hasNext()&&input2.hasNext())
        {
            String s1 = input1.nextLine().trim();
            String s2 = input2.nextLine().trim();
            if(!s1.equals(s2)) 
            {
                input1.close();
                input2.close();
                return false;
            }
        }
        boolean res;
        if(!input1.hasNext()&&!input2.hasNext()) res = true;
        else res = false;
        input1.close();
        input2.close();
        return res;
        
   }
      /**
    * Builds a file with a given name with a content defined by an array of objects that are printed to the file as strings, one string per line  
    * @param fileName name of file to write to
    * @param testCase array of objects to print into file in string format
    * @throws IOException throws exception when file fails to open for writing or writing fails
    */
   public static void buildTestFile(String fileName, Object[] testCase) throws IOException
   {
        FileWriter file = new FileWriter(fileName); 
        PrintWriter outputFile = new PrintWriter(file);
        
        for (Object a: testCase)
        {
            outputFile.println(a);
        }
        outputFile.close();
   }  
 
    
}
