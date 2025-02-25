import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TestValidateInt {

	public static boolean tests(PrintWriter outputStream)
	{
        int count = 0;
        int expectedCount = 4;
        
        outputStream.print("\r\n----Tests for ValidateInt-------------------------------------------------------------\r\n");

        // Test 1 //
        outputStream.print("\r\n____Test 01____________________________________________________________________________\r\n");
        String sep = System.lineSeparator();
		String userInput = String.format("10");
		String expectedOutput = "(?si).*?Enter test value.*?";
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
	   
	    Scanner keyboard = new Scanner(System.in);
	    int res = NumericPatternMenu.validateInt("Enter test value\n", keyboard);
		//System.out.println("End of Test");
		//String[] lines = baos.toString().split(System.lineSeparator());
		String actual = baos.toString();
		printStream.close();

		actual = baos.toString();
		printStream.close();

		outputStream.print("\r\nActual Output:\r\n");
		outputStream.println("\""+actual+"\"");
		
		outputStream.print("\r\nReturned integer value:\r\n");
		outputStream.println(res);
		outputStream.println();
		if(res==10 && Pattern.matches(expectedOutput, actual))
		{	
			outputStream.printf("%-80s%-10s\r\n", "validateInt() TEST 01 - one positive integer",  "PASSED");
			count++;		
		}
		else
		{
			outputStream.printf("%-80s%-10s\r\n", "validateInt() TEST 01 - one positive integer",  "FAILED");
		}

        // Test 2 //
      
		outputStream.print("\r\n_____Test 02____________________________________________________________________________\r\n");
		userInput = String.format("-3");
		expectedOutput = "(?si).*?Enter test value.*?";
		outputStream.print("\r\nInput:\r\n");
		outputStream.println(userInput);
		outputStream.print("\r\nExpected output must fit RegEx:\r\n");
		outputStream.println("\""+expectedOutput+"\"");

		//standard = System.out;
		
	    bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);
	    baos = new ByteArrayOutputStream();
	    printStream = new PrintStream(baos);
	    System.setOut(printStream);
	   
	    keyboard = new Scanner(System.in);
	    res = NumericPatternMenu.validateInt("Enter test value\n", keyboard);

		actual = baos.toString();
		printStream.close();

		actual = baos.toString();
		printStream.close();

		outputStream.print("\r\nActual Output:\r\n");
		outputStream.println("\""+actual+"\"");
		
		outputStream.print("\r\nReturned integer value:\r\n");
		outputStream.println(res);
		outputStream.println();
		if(res==-3 && Pattern.matches(expectedOutput, actual))
		{	
			outputStream.printf("%-80s%-10s\r\n", "validateInt() TEST 01 - one negative integer",  "PASSED");
			count++;		
		}
		else
		{
			outputStream.printf("%-80s%-10s\r\n", "validateInt() TEST 01 - one negative integer",  "FAILED");
		}
		
        // Test 3 //
	       
		outputStream.print("\r\n_____Test 03____________________________________________________________________________\r\n");
		
		userInput = String.format("yiuyuiy%s4.5%s77",sep, sep);
		expectedOutput = "(?si).*?ERROR.*?ERROR.*";
		outputStream.print("\r\nInput:\r\n");
		outputStream.println(userInput);
		outputStream.print("\r\nExpected output must fit RegEx:\r\n");
		outputStream.println("\""+expectedOutput+"\"");

		//standard = System.out;
		
	    bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);
	    baos = new ByteArrayOutputStream();
	    printStream = new PrintStream(baos);
	    System.setOut(printStream);
	   
	    keyboard = new Scanner(System.in);
	    res = NumericPatternMenu.validateInt("Enter test value\n", keyboard);

		actual = baos.toString();
		printStream.close();

		actual = baos.toString();
		printStream.close();

		outputStream.print("\r\nActual Output:\r\n");
		outputStream.println("\""+actual+"\"");
		
		outputStream.print("\r\nReturned integer value:\r\n");
		outputStream.println(res);
		outputStream.println();
		if(res==77 && Pattern.matches(expectedOutput, actual))
		{	
			outputStream.printf("%-80s%-10s\r\n", "validateInt() TEST 01 - one negative integer",  "PASSED");
			count++;		
		}
		else
		{
			outputStream.printf("%-80s%-10s\r\n", "validateInt() TEST 01 - one negative integer",  "FAILED");
		}

		System.setOut(standard);
		
		outputStream.print("\r\n++++ 3 Tests of validateInt() method COMPLETE +++++++++++++++++++++++++++\r\n");		
        
		if (count==expectedCount) return true;
        else return false;
	}	
	

}
