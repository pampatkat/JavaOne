import java.io.*;
import java.util.regex.*; 


public class TestCircleArea {
	
	public static boolean tests(PrintWriter outputStream)
	{
        int count = 0;
        int expectedCount = 2;
        
        outputStream.print("\r\n----Tests for CircleArea----------------------------------------\r\n");

        // Test 1 //
        outputStream.print("\r\n____Test 01_______________________________________________________\r\n");
		String userInput = String.format("10",System.lineSeparator());
		String expectedOutput = "(?si).*?10.*?314.*";
		outputStream.print("\r\nInput:\r\n");
		outputStream.println(userInput);
		outputStream.print("\r\nExpected output must fit RegEx:\r\n");
		outputStream.println("\""+expectedOutput+"\"");

		PrintStream standard = System.out;
	    ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream printStream = new PrintStream(baos);
	    System.setOut(printStream);
	   
	    CircleArea.main(null);
		
		String actual = baos.toString();
		printStream.close();

		outputStream.print("\r\nActual Output:\r\n");
		outputStream.println("\""+actual+"\"");
		outputStream.println();
		if(Pattern.matches(expectedOutput, actual))
		{	
			outputStream.printf("%-50s%-10s\r\n", "CircleArea TEST 01",  "PASSED");
			count++;		
		}
		else
		{
			outputStream.printf("%-50s%-10s\r\n", "CircleArea TEST 01",  "FAILED");
		}
		
        //  Test 2  //
       
		outputStream.print("\r\n____Test 02_______________________________________________________\r\n");
		userInput = String.format("20",System.lineSeparator());
		expectedOutput = "(?si).*?20.*?1256.*";
		outputStream.print("\r\nInput:\r\n");
		outputStream.println(userInput);
		outputStream.print("\r\nExpected output must fit RegEx:\r\n");
		outputStream.println("\""+expectedOutput+"\"");
		
	    bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);
	    baos = new ByteArrayOutputStream();
	    printStream = new PrintStream(baos);
	    System.setOut(printStream);
	   
		CircleArea.main(null);
		actual = baos.toString();
		printStream.close();

		outputStream.print("\r\nActual Output:\r\n");
		outputStream.println("\""+actual+"\"");
		outputStream.println();
		if(Pattern.matches(expectedOutput, actual))
		{	
			outputStream.printf("%-50s%-10s\r\n", "CircleArea TEST 02",  "PASSED");
			count++;		
		}
		else
		{
			outputStream.printf("%-50s%-10s\r\n", "CircleArea TEST 02",  "FAILED");
		}
      outputStream.print("\r\n++++ 2 tests for CircleArea COMPLETE +++++++++++++++++++++++++++\r\n");
		System.setOut(standard);
        if (count==expectedCount) return true;
        else return false;
	
	}
}
