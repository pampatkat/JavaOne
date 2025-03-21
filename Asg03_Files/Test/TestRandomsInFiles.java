
import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TestRandomsInFiles {

	public static boolean tests(PrintWriter outputStream)
	{
        int count = 0;
        int expectedCount = 4;
        
        outputStream.print("\r\n----Tests for RandomsInFile--------------------------------------------------------\r\n");

 
        // Test 1 //
        outputStream.print("\r\n____Test 01____________________________________________________________________________\r\n");
        String sep = System.lineSeparator();
		String userInput = String.format("1%s1%sabc.txt",sep, sep);
		String expectedOutput = "(?si).*";
		outputStream.print("\r\nInput:\r\n");
		outputStream.println(userInput);
		outputStream.println("\r\nThis test checks if file with name abc.txt was created and was filled with 100 numbers in range [1, 1]\r\n");
		//outputStream.println("\""+expectedOutput+"\"");

		PrintStream standard = System.out;
		
	    ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream printStream = new PrintStream(baos);
	    System.setOut(printStream);
	   
	    RandomsInFile.main(null);

		String actual = baos.toString();
		printStream.close();

		String s = fileStructureTest();

		if(s.equals("All good!"))
		{	
			outputStream.printf("%-80s%-10s\r\n", "RandomsInFile TEST 01 file structure",  "PASSED");
			count++;		
		}
		else
		{
			outputStream.printf("%-80s%-10s\r\n", "RandomsInFile TEST 01 file structure",  "FAILED");
			outputStream.println("ERROR: "+ s);
		}

        // Test 2 //
       
		outputStream.print("\r\n_____Test 02____________________________________________________________________________\r\n");
		userInput = String.format("zz%s3.5%s1%s5.6%shh%s5%sa1.txt",sep, sep, sep, sep, sep, sep);
		expectedOutput = "(?si).*?ERROR.*?ERROR.*?ERROR.*?ERROR.*";
		outputStream.print("\r\nInput:\r\n");
		outputStream.println(userInput);
		outputStream.print("\r\nExpected output must fit RegEx:\r\n");
		outputStream.println("\""+expectedOutput+"\"");

	    bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);
	    baos = new ByteArrayOutputStream();
	    printStream = new PrintStream(baos);
	    System.setOut(printStream);
	   
	    RandomsInFile.main(null);

		actual = baos.toString();
		printStream.close();
		
		File file = new File("a1.txt");
		outputStream.print("\r\nActual Output:\r\n");
		outputStream.println("\""+actual+"\"");
		outputStream.println();
		if(Pattern.matches(expectedOutput, actual)&&file.exists())
		{	
			outputStream.printf("%-80s%-10s\r\n", "RandomsInFile TEST 02 - input validation - wrong type",  "PASSED");
			count++;		
		}
		else
		{
			outputStream.printf("%-80s%-10s\r\n", "RandomsInFile TEST 02 - input validation - wrong type",  "FAILED");
		}
		if(!file.exists())
		{
			outputStream.println("ERROR: output file was not created");
		}
		
        // Test 3 //
	       
		outputStream.print("\r\n_____Test 03____________________________________________________________________________\r\n");
		
		userInput = String.format("-1%saaa%s-8%s1%sabc%s-40%s3%sa2.txt",sep, sep, sep, sep, sep, sep, sep);
		expectedOutput = "(?si).*?ERROR.*?ERROR.*?ERROR.*?ERROR.*?ERROR.*";
		outputStream.print("\r\nInput:\r\n");
		outputStream.println(userInput);
		outputStream.print("\r\nExpected output must fit RegEx:\r\n");
		outputStream.println("\""+expectedOutput+"\"");

	    bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);
	    baos = new ByteArrayOutputStream();
	    printStream = new PrintStream(baos);
	    System.setOut(printStream);
	   
	    RandomsInFile.main(null);

		actual = baos.toString();
		printStream.close();

		file = new File("a2.txt");

		if(Pattern.matches(expectedOutput, actual)&&file.exists())
		{	
			outputStream.printf("%-80s%-10s\r\n", "RandomsInFile TEST 03 - input validation - wrong type & negatives",  "PASSED");
			count++;		
		}
		else
		{
			outputStream.printf("%-80s%-10s\r\n", "RandomsInFile TEST 03 - input validation - wrong type & negatives",  "FAILED");
		}
		if(!file.exists())
		{
			outputStream.println("ERROR: output file was not created");
		}
        // Test 4 //
	       
		outputStream.print("\r\n_____Test 04____________________________________________________________________________\r\n");
		
		userInput = String.format("6%s1%sa3.txt",sep, sep);
		expectedOutput = "(?si).*";
		outputStream.print("\r\nInput:\r\n");
		outputStream.println(userInput);
		outputStream.print("\r\nExpected output must fit RegEx:\r\n");
		outputStream.println("\""+expectedOutput+"\"");

	    bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);
	    baos = new ByteArrayOutputStream();
	    printStream = new PrintStream(baos);
	    System.setOut(printStream);
	   
	    RandomsInFile.main(null);

		actual = baos.toString();
		printStream.close();

		file = new File("a3.txt");
		
		outputStream.print("\r\nActual Output:\r\n");
		outputStream.println("\""+actual+"\"");
		outputStream.println();
		if(Pattern.matches(expectedOutput, actual)&&file.exists())
		{	
			outputStream.printf("%-80s%-10s\r\n", "RandomsInFile TEST 04 - incorrect range order",  "PASSED");
			count++;		
		}
		else
		{
			outputStream.printf("%-80s%-10s\r\n", "RandomsInFile TEST 04 - incorrect range order",  "FAILED");
		}
		if(!file.exists())
		{
			outputStream.println("ERROR: output file was not created");
		}
		System.setOut(standard);
		outputStream.print("\r\n++++ 4 Tests of RandomsInFile COMPLETE +++++++++++++++++++++++++++\r\n");
		System.setOut(standard);
        if (count==expectedCount) return true;
        else return false;
	}	
	
	public static String fileStructureTest() {
		String fileName = "abc.txt";
		String value = "1";
		int expectedNumLines = 100;
		int numLines = 0;
		 try {
	            
			 File file = new File(fileName);
		     Scanner inFile = new Scanner(file);
		        while (inFile.hasNext())
		        {
		           String tmp = inFile.nextLine();
		           if(!tmp.equals(value)) return "Incorrect range of values";
		           numLines++;
		        }
		        inFile.close();
		        if(numLines!=expectedNumLines) 
		        	   return "Incorrect number of lines: "+numLines;
		        
		        return "All good!";  

		 }
		 catch (IOException e)
		 {
			 return "File was not created";
		 }
	}

}
