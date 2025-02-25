import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.regex.Pattern;

public class TestNumericPatternMenu {

	public static boolean tests(PrintWriter outputStream)
	{
        int count = 0;
        int expectedCount = 4;
        
        outputStream.print("\r\n----Tests for NumericPatternMenu--------------------------------------------------------\r\n");

        // Test 1 //
        outputStream.print("\r\n____Test 01____________________________________________________________________________\r\n");

        String sep = System.lineSeparator();
		String userInput = String.format("1%s5%s2%s4%s3",sep, sep, sep, sep);
		String expectedOutput = "(?si).*?Numeric Pattern Display.*?123454321.*?Numeric Pattern Display.*?4321234.*?Numeric Pattern Display.*";
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
	   
	    NumericPatternMenu.main(null);

		String actual = baos.toString();
		printStream.close();

		outputStream.print("\r\nActual Output:\r\n");
		outputStream.println("\""+actual+"\"");
		outputStream.println();
		if(Pattern.matches(expectedOutput, actual))
		{	
			outputStream.printf("%-80s%-10s\r\n", "NumericPatternMenu TEST 01 - perfect input",  "PASSED");
			count++;		
		}
		else
		{
			outputStream.printf("%-80s%-10s\r\n", "NumericPatternMenu TEST 01 - perfect input",  "FAILED");
		}

		
        // Test 2 //
	       
		outputStream.print("\r\n_____Test 02____________________________________________________________________________\r\n");

		userInput = String.format("abc%s6%s1%soops%s-7%s5%s2%s3.4%s-1%s7%s3",sep, sep, sep, sep, sep, sep, sep, sep, sep, sep);
		expectedOutput = "(?si).*?Numeric Pattern Display.*?ERROR.*?Numeric Pattern Display.*?ERROR.*?Numeric Pattern Display.*?size.*?ERROR.*?size.*?ERROR.*?size.*?123454321.*?Numeric Pattern Display.*?size.*?ERROR.*?size.*?ERROR.*?size.*?7654321234567.*?Numeric Pattern Display.*";
		outputStream.print("\r\nInput:\r\n");
		outputStream.println(userInput);
		outputStream.print("\r\nExpected output must fit RegEx:\r\n");
		outputStream.println("\""+expectedOutput+"\"");

	    bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);
	    baos = new ByteArrayOutputStream();
	    printStream = new PrintStream(baos);
	    System.setOut(printStream);
	   
	    NumericPatternMenu.main(null);

		actual = baos.toString();
		printStream.close();

		outputStream.print("\r\nActual Output:\r\n");
		outputStream.println("\""+actual+"\"");
		outputStream.println();
		if(Pattern.matches(expectedOutput, actual))
		{	
			outputStream.printf("%-80s%-10s\r\n", "NumericPatternMenu TEST 02 - incorrect user input",  "PASSED");
			count++;		
		}
		else
		{
			outputStream.printf("%-80s%-10s\r\n", "NumericPatternMenu TEST 02 - incorrect user input",  "FAILED");
		}


		System.setOut(standard);
		
		outputStream.print("\r\n++++ 3 Tests of NumericPatternMenu COMPLETE +++++++++++++++++++++++++++\r\n");		
        
		
        if (count==expectedCount) return true;
        else return false;
	}
}
