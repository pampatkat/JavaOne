import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestTwoMethodsEC01 {

    /**
    * Method runs all test cases for pyramidInFile() method 
    */
   public static boolean testPyramidInFile(PrintWriter outputStream)
   {
		int count = 0;
		int expectedCount = 8;
		
		outputStream.println("\r\n----pyramidInFile() Tests------------------------------------------------------------\r\n");
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
    	   TwoMethodsECA01.pyramidInFile(1, "test01.txt"); 
            if(areEqualFiles("test01.txt", "testCase1.txt")) {
            	outputStream.printf("%-80s%-10s\n", "pyramidInFile() TEST 01 - pattern of size 1",  "PASSED");
            	count++;
            }
            else {
            	outputStream.printf("%-80s%-10s\n", "pyramidInFile() TEST 01 - pattern of size 1",  "FAILED");
            }

            //--- Test 2 ---//
            TwoMethodsECA01.pyramidInFile(2, "test02.txt"); 
            if(areEqualFiles("test02.txt", "testCase2.txt")) {
            	outputStream.printf("%-80s%-10s\n", "pyramidInFile() TEST 02 - pattern of size 2",  "PASSED");
            	count++;
            }
            else {
            	outputStream.printf("%-80s%-10s\n", "pyramidInFile() TEST 02 - pattern of size 2",  "FAILED");
            }

            //--- Test 3 ---//
            TwoMethodsECA01.pyramidInFile(3, "test03.txt"); 
            if(areEqualFiles("test03.txt", "testCase3.txt")) {
            	outputStream.printf("%-80s%-10s\n", "pyramidInFile() TEST 03 - pattern of size 3",  "PASSED");
            	count++;
            }
            else {
            	outputStream.printf("%-80s%-10s\n", "pyramidInFile() TEST 03 - pattern of size 3",  "FAILED");
            }

            //--- Test 4 ---//
            TwoMethodsECA01.pyramidInFile(4, "test04.txt"); 
            if(areEqualFiles("test04.txt", "testCase4.txt")) {
            	outputStream.printf("%-80s%-10s\n", "pyramidInFile() TEST 04 - pattern of size 4",  "PASSED");
            	count++;
            }
            else {
            	outputStream.printf("%-80s%-10s\n", "pyramidInFile() TEST 04 - pattern of size 4",  "FAILED");
            }

            //--- Test 5 ---//
            TwoMethodsECA01.pyramidInFile(5, "test05.txt"); 
            if(areEqualFiles("test05.txt", "testCase5.txt")) {
            	outputStream.printf("%-80s%-10s\n", "pyramidInFile() TEST 05 - pattern of size 5",  "PASSED");
            	count++;
            }
            else {
            	outputStream.printf("%-80s%-10s\n", "pyramidInFile() TEST 05 - pattern of size 5",  "FAILED");
            }

            //--- Test 6 ---//
            TwoMethodsECA01.pyramidInFile(8, "test08.txt"); 
            if(areEqualFiles("test08.txt", "testCase8.txt")) {
            	outputStream.printf("%-80s%-10s\n", "pyramidInFile() TEST 06 - pattern of size 8",  "PASSED");
            	count++;
            }
            else {
            	outputStream.printf("%-80s%-10s\n", "pyramidInFile() TEST 06 - pattern of size 8",  "FAILED");
            }

            //--- Test 7 ---//    
            // Test on exception(s) that your method is supposed to throw
            try {
            	TwoMethodsECA01.pyramidInFile(-8, "test07.txt");
	            outputStream.printf("%-80s%-10s\n", "pyramidInFile() TEST 07 - IllegalArgumentException, negative parameter",  "FAILED");
	       }
	       catch(IllegalArgumentException e)
	       {
	    	   outputStream.printf("%-80s%-10s\n", "pyramidInFile() TEST 07 - IllegalArgumentException, negative parameter",  "PASSED");
	    	   count++;
	       }
            //--- Test 8 ---//    
            // Test on IOException that your method is supposed to throw
            try {
            	TwoMethodsECA01.pyramidInFile(8, "a\\test07.txt");
	            outputStream.printf("%-80s%-10s\n", "pyramidInFile() TEST 08 - IOException",  "FAILED");
            }
            catch(IOException e)
            {
            	outputStream.printf("%-80s%-10s\n", "pyramidInFile() TEST 08 - IOException",  "PASSED");
            	count++;
            }

       }
       catch(IOException e)
       {
    	   outputStream.printf("FAIL: Unexpected IOException. pyramidInFile() may not be implemented yet");
       }
       
		if (count == expectedCount)
			return true;
		else
			return false;
               
   }

     /**
      * This method tests powersOfTwoInFile() method
      * Two sets of files are automatically generated:
      * testCaseIn.txt files are used as input file for powersOfTwoInFile()
      * testCaseOut.txt contain the expected result that must be generated by powersOfTwoInFile()
      */
     public static boolean testFactorsOfTwoInFile(PrintWriter outputStream)
     {
 		int count = 0;
 		int expectedCount = 3;
 		
 		outputStream.println("\r\n----powersOfTwoInFile() Tests------------------------------------------------------------\r\n");
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
        	TwoMethodsECA01.factorsOfTwoInFile("testCaseIn01.txt", "test01.txt");
            if(areEqualFiles("test01.txt", "testCaseOut01.txt")) {
            	outputStream.printf("%-80s%-10s\n", "powersOfTwoInFile() TEST 01 - empty input file",  "PASSED");
            	count++;
            }
            else {
            	outputStream.printf("%-80s%-10s\n", "powersOfTwoInFile() TEST 01 - empty input file",  "FAILED");  
            }
            
            //--- Test 2 ---//
            // test for all other cases
            TwoMethodsECA01.factorsOfTwoInFile("testCaseIn02.txt", "test02.txt"); // call on your method
            if(areEqualFiles("test02.txt", "testCaseOut02.txt")) {
            	outputStream.printf("%-80s%-10s\n", "powersOfTwoInFile() TEST 02 - general case, mixed values in file",  "PASSED");
            	count++;
            }
            else {
            	outputStream.printf("%-80s%-10s\n", "powersOfTwoInFile() TEST 02 - general case, mixed values in file",  "FAILED");            
            }
 
            //--- Test 3 ---//
            // Test on IO exception(s) your method is supposed to throw
            try {
            	TwoMethodsECA01.factorsOfTwoInFile("doesNotExist.txt", "test03.txt"); 
            	outputStream.printf("%-80s%-10s\n", "powersOfTwoInFile() TEST 03 - IOException",  "FAILED");  
            }
	        catch(FileNotFoundException e)
	        {
	        	outputStream.printf("%-80s%-10s\n", "powersOfTwoInFile() TEST 03 - IOException",  "PASSED");  
	        	count++;
	        }
        }
        catch(IOException e)
        {
        	outputStream.printf("FAIL: Unexpected IOException. powersOfTwoInFile() may not be implemented yet");
        }
        
		if (count == expectedCount)
			return true;
		else
			return false;
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
