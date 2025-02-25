import java.io.*;
import java.util.Scanner;
/**
* @author YOUR NAME here
*/

public class A04Methods {
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        testNumericPattern();
        testFileAnalysis();
    }


    public static String numericPattern(int size, boolean direction) throws IllegalArgumentException
    {
      return "";
    }

    
    public static void fileAnalysis(String inputFileName, String outputFileName) throws IOException
    {
    
    }
 
  
   /**
    * Method runs all test cases for numericPattern() method 
    */ 
   public static void testNumericPattern()
   {
	   System.out.println("\r\n----numericPattern() Tests------------------------------------------------------------\r\n");
       
         //--- Test 1 ---//
        
       if(numericPattern(1, true).equals("1")
        		&& numericPattern(1, false).equals("1")) 
     	{
     		System.out.printf("%-80s%-10s\n", "numericPattern() TEST 01 - pattern of size 1",  "PASSED");
     		
     	}
       else {
        	System.out.printf("%-80s%-10s\n", "numericPattern() TEST 01 - pattern of size 1",  "FAILED");
        }
       
         //--- Test 2 ---//
        
       if(numericPattern(5, false).equals("543212345")
    		   && numericPattern(6, true).equals("12345654321")) 
 	    {
    	   System.out.printf("%-80s%-10s\n", "numericPattern() TEST 02 - pattern of given positive size",  "PASSED");
    	   
 	    }	       
       else {
    	   System.out.printf("%-80s%-10s\n", "numericPattern() TEST 02 - pattern of given positive size",  "FAILED");
       }
        
        //--- Test 3 ---//
        try
        {
            String ignoreMe = numericPattern(0, false);
            System.out.printf("%-80s%-10s\n", "numericPattern() TEST 03 - IllegalArgumentException - size 0",  "FAILED");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("%-80s%-10s\n", "numericPattern() TEST 03 - IllegalArgumentException - size 0",  "PASSED");
        }
        //--- Test 4 ---//
        try
        {
            String ignoreMe = numericPattern(-55, false);
            System.out.printf("%-80s%-10s\n", "numericPattern() TEST 03 - IllegalArgumentException - negative size",  "FAILED");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("%-80s%-10s\n", "numericPattern() TEST 03 - IllegalArgumentException - negative size",  "PASSED");
        }       
       
   }
  
   /**
    * Method runs all test cases for fileAnalysis() method 
    * The Method generates a number of test case files. 
    * Please see those files to make sure your file output format matches the output format in test files
    */
   public static void testFileAnalysis()
   {
      System.out.println("\n--------- fileAnalysis() Tests ---------");
      Integer[] testIn1 = {};
      String[] testOut1 = {"Numeric data file \"testCaseIn1.txt\" is empty"};
      Integer[] testIn2 = {0};
      String[] testOut2 = {"Numeric data file \"testCaseIn2.txt\" has only one number: 0"};
      Integer[] testIn3 = {0, 0};
      String[] testOut3 = {"Numeric Data File \"testCaseIn3.txt\" Analysis", "Number of integers: 2","The sum of all integers in file: 0", "The largest integer in the set: 0", "The smallest integer in the set: 0"};      
      Integer[] testIn4 = {33, 1, 0, 2}; 
      String[] testOut4 = {"Numeric Data File \"testCaseIn4.txt\" Analysis", "Number of integers: 4","The sum of all integers in file: 36", "The largest integer in the set: 33", "The smallest integer in the set: 0"};      
      Integer[] testIn5 = {Integer.MAX_VALUE, Integer.MAX_VALUE};
      String[] testOut5 = {"Numeric Data File \"testCaseIn5.txt\" Analysis", "Number of integers: 2","The sum of all integers in file: -2", "The largest integer in the set: 2147483647", "The smallest integer in the set: 2147483647"};      
      Integer[] testIn6 = {Integer.MIN_VALUE, Integer.MAX_VALUE};
      String[] testOut6 = {"Numeric Data File \"testCaseIn6.txt\" Analysis", "Number of integers: 2","The sum of all integers in file: -1", "The largest integer in the set: 2147483647", "The smallest integer in the set: -2147483648"};      
   
      try{
        //--- Test 1 ---//
        // building test case files 
        buildTestFile("testCaseIn1.txt", testIn1); 
        buildTestFile("testCaseOut1.txt", testOut1);
        
        // calling method
        fileAnalysis("testCaseIn1.txt", "test01.txt");
        
        // comparing resulting files
        
        if(areEqualFiles("testCaseOut1.txt", "test01.txt"))
     	{
     	  System.out.printf("%-80s%-10s\n", "fileAnalysis() TEST 01 - empty file",  "PASSED");
     	}
        else {
        	System.out.printf("%-80s%-10s\n", "fileAnalysis() TEST 01 - empty file",  "FAILED");
        }
 
        //--- Test 2 ---//
        buildTestFile("testCaseIn2.txt", testIn2);
        buildTestFile("testCaseOut2.txt", testOut2);
        
        fileAnalysis("testCaseIn2.txt", "test02.txt");        
        
        if(areEqualFiles("testCaseOut2.txt", "test02.txt")) 
        {
        	System.out.printf("%-80s%-10s\n", "fileAnalysis() TEST 02 - file with one number",  "PASSED");
        	
        }
        else {
        	System.out.printf("%-80s%-10s\n", "fileAnalysis() TEST 02 - file with one number",  "FAILED"); 
        }
        
        //--- Test 3 ---//
        buildTestFile("testCaseIn3.txt", testIn3);
        buildTestFile("testCaseOut3.txt", testOut3);
        
        fileAnalysis("testCaseIn3.txt", "test03.txt");
        
        if(areEqualFiles("testCaseOut3.txt", "test03.txt")) 
        {
        	System.out.printf("%-80s%-10s\n", "fileAnalysis() TEST 03 - two values in file",  "PASSED");
        	
        }
        else {
        	System.out.printf("%-80s%-10s\n", "fileAnalysis() TEST 03 - two values in file",  "FAILED");
        }
        
        //--- Test 4 ---//
        buildTestFile("testCaseIn4.txt", testIn4);
        buildTestFile("testCaseOut4.txt", testOut4);
        
        fileAnalysis("testCaseIn4.txt", "test04.txt"); 
        
        if(areEqualFiles("testCaseOut4.txt", "test04.txt")) 
        {
        	System.out.printf("%-80s%-10s\n", "fileAnalysis() TEST 04 - multiple values in file",  "PASSED");
        	
        }
        else {
        	System.out.printf("%-80s%-10s\n", "fileAnalysis() TEST 04 - multiple values in file",  "FAILED");
        }
        
        //--- Test 5 ---//
        buildTestFile("testCaseIn5.txt", testIn5);
        buildTestFile("testCaseOut5.txt", testOut5);
        
        fileAnalysis("testCaseIn5.txt", "test05.txt"); 
        
        if(areEqualFiles("testCaseOut5.txt", "test05.txt")) 
        {
        	System.out.printf("%-80s%-10s\n", "fileAnalysis() TEST 05 - Integer.MAX_VALUE in file",  "PASSED");
        	
        }
        else {
        	System.out.printf("%-80s%-10s\n", "fileAnalysis() TEST 05 - Integer.MAX_VALUE in file",  "FAILED");
        }
        
        //--- Test 6 ---//
        buildTestFile("testCaseIn6.txt", testIn6);
        buildTestFile("testCaseOut6.txt", testOut6);
        
        fileAnalysis("testCaseIn6.txt", "test06.txt"); 
        
        if(areEqualFiles("testCaseOut6.txt", "test06.txt")) 
        {
        	System.out.printf("%-80s%-10s\n", "fileAnalysis() TEST 06 - Integer.MAX_VALUE, Integer.MIN_VALUE in file",  "PASSED");
        	
        }
        else {
        	System.out.printf("%-80s%-10s\n", "fileAnalysis() TEST 06 - Integer.MAX_VALUE, Integer.MIN_VALUE in file",  "FAILED");
        }
 
        
        //--- Test 7 ---//
        // Test on exception(s) that your method is supposed to throw
        fileAnalysis("doesNotExist.txt", "test07.txt"); 
        System.out.printf("%-80s%-10s\n", "fileAnalysis() TEST 07 - IOException",  "FAILED");
      }
      catch(FileNotFoundException e)
      {
    	  System.out.printf("%-80s%-10s\n", "fileAnalysis() TEST 07 - IOException",  "PASSED");
      }
      catch(IOException e)
      {
          System.out.printf("FAIL: Unexpected IOException. fileAnalysis() may not be implemented yet");
      }
   
      
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

}
