import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestTwoMethodsEC02 {

    public static boolean testSentenceEditor(PrintWriter outputStream)
    {
    	
		int count = 0;
		int expectedCount = 2;

    	outputStream.println("\r\n----sentenceEditor() Tests------------------------------------------------------------\r\n");
    	
        String test1 = "hello.  my  name    is  Joe. what   is your name?    have   no   clue!";
        String match1 = "Hello. My name is Joe. What is your name? Have no clue!";
        
 // Test #1
        
        if(TwoMethodsEC02.sentenceEditor(test1).equals(match1)) 
        {
            outputStream.printf("%-80s%-10s\r\n", "Test 01 for sentenceEditor()",  "PASSED");
            
        }
        else  outputStream.printf("%-80s%-10s\r\n", "Test 01 for sentenceEditor()",  "FAILED");       

        String test2 = "one,      two.   three, four ?   five,    sixty   seven!  Eight.";
        String match2 = "One, two. Three, four ? Five, sixty seven! Eight.";
 
// Test #2
        if(TwoMethodsEC02.sentenceEditor(test2).equals(match2)) 
        {
            outputStream.printf("%-80s%-10s\r\n", "Test 02 for sentenceEditor()",  "PASSED");
            
        }
        else  outputStream.printf("%-80s%-10s\r\n", "Test 02 for sentenceEditor()",  "FAILED"); 
       
		if (count == expectedCount)
			return true;
		else
			return false;
    }
    
   /**
    * Method runs all test cases for fileAnalysis() method 
    * The Method generates a number of test case files. 
    * Please see those files to make sure your file output format matches the output format in test files
    */
   public static boolean testCharCount(PrintWriter outputStream)
   {
	   
	   int count = 0;
	   int expectedCount = 4;
	   
	   outputStream.println("\r\n----charCount() Tests-----------------------------------------------------------------\r\n"); 
	   
      String test01 = "Alex A.";
      String test02 = "aa   bbb cccca.";
      String test03 = "the quick brown fox jumps over the lazy dog";
      String[] testOut1 = {"  1", ". 1", "A 2", "e 1", "l 1", "x 1"};
      String[] testOut2 = {"  4", ". 1", "a 3", "b 3", "c 4"};
      String[] testOut3 = {"  8", "a 1", "b 1", "c 1", "d 1", "e 3", "f 1", "g 1", "h 2", "i 1", "j 1", "k 1", "l 1", "m 1", "n 1", "o 4", "p 1", "q 1", "r 2", "s 1", "t 2", "u 2", "v 1", "w 1", "x 1", "y 1", "z 1"};      
   
      try{
        //--- Test 1 ---//
        // building test case file
        buildTestFile("testCaseOut1.txt", testOut1);
        
        // calling method
        TwoMethodsEC02.charCount(test01, "test01.txt");
        // comparing resulting files
        if(areEqualFiles("testCaseOut1.txt", "test01.txt"))
        {
            outputStream.printf("%-80s%-10s\r\n", "Test 01 for charCount()",  "PASSED");
             
        }
        else outputStream.printf("%-80s%-10s\r\n", "Test 02 for sentenceEditor()",  "FAILED");
 
        //--- Test 2 ---//
        buildTestFile("testCaseOut2.txt", testOut2);
        
        TwoMethodsEC02.charCount(test02, "test02.txt");        
       if(areEqualFiles("testCaseOut2.txt", "test02.txt"))
       {
           outputStream.printf("%-80s%-10s\r\n", "Test 02 for charCount()",  "PASSED");
            
       }
        else outputStream.printf("%-80s%-10s\r\n", "Test 02 for charCount()",  "FAILED");
        
        //--- Test 3 ---//
        buildTestFile("testCaseOut3.txt", testOut3);
        
        TwoMethodsEC02.charCount(test03, "test03.txt");        
        if(areEqualFiles("testCaseOut3.txt", "test03.txt"))
        {
            outputStream.printf("%-80s%-10s\r\n", "Test 03 for charCount()",  "PASSED");
             
        }
        else outputStream.printf("%-80s%-10s\r\n", "Test 03 for charCount()",  "FAILED");
      }
      catch(IOException e)
      {
          System.out.println("Trouble with file IO or method may be not implemented yet."+e.getMessage());
      }
    //--- Test 4 ---//
      try
      {
    	  TwoMethodsEC02.charCount(test01, "noSuchDirectory/a.txt");
    	  outputStream.printf("%-80s%-10s\r\n", "Test 04 for charCount() - IOException",  "FAILED");
      }
      catch(IOException e)
      {
    	  outputStream.printf("%-80s%-10s\r\n", "Test 04 for charCount() - IOException",  "PASSED");
      }

		if (count == expectedCount)
			return true;
		else
			return false;
      
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
