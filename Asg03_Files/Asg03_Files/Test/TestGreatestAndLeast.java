import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.regex.Pattern;

public class TestGreatestAndLeast {
	public static boolean tests(PrintWriter outputStream)
	{
        int count = 0;
        int expectedCount = 4;
        
        outputStream.print("\r\n----Tests for GreatestAndLeast--------------------------------------------------------\r\n");

        // Test 1 //
        outputStream.print("\r\n____Test 01____________________________________________________________________________\r\n");
        String sep = System.lineSeparator();
		String userInput = String.format("-99");
		String expectedOutput = "(?si).*?No numbers were entered.*";
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
	   
	    GreatestAndLeast.main(null);
		//System.out.println("End of Test");
		//String[] lines = baos.toString().split(System.lineSeparator());
		String actual = baos.toString();
		printStream.close();

		outputStream.print("\r\nActual Output:\r\n");
		outputStream.println("\""+actual+"\"");
		outputStream.println();
		if(Pattern.matches(expectedOutput, actual))
		{	
			outputStream.printf("%-80s%-10s\r\n", "GreatestAndLeast TEST 01 - no numbers",  "PASSED");
			count++;		
		}
		else
		{
			outputStream.printf("%-80s%-10s\r\n", "GreatestAndLeast TEST 01 - no numbers",  "FAILED");
		}

        // Test 2 //
       
		outputStream.print("\r\n_____Test 02____________________________________________________________________________\r\n");
		userInput = String.format("3%s-99",sep);
		expectedOutput = "(?si).*?largest.*?3.*?smallest.*?3.*";
		outputStream.print("\r\nInput:\r\n");
		outputStream.println(userInput);
		outputStream.print("\r\nExpected output must fit RegEx:\r\n");
		outputStream.println("\""+expectedOutput+"\"");

	    bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);
	    baos = new ByteArrayOutputStream();
	    printStream = new PrintStream(baos);
	    System.setOut(printStream);
	   
	    GreatestAndLeast.main(null);

		actual = baos.toString();
		printStream.close();

		outputStream.print("\r\nActual Output:\r\n");
		outputStream.println("\""+actual+"\"");
		outputStream.println();
		if(Pattern.matches(expectedOutput, actual))
		{	
			outputStream.printf("%-80s%-10s\r\n", "GreatestAndLeast TEST 02 - no numbers",  "PASSED");
			count++;		
		}
		else
		{
			outputStream.printf("%-80s%-10s\r\n", "GreatestAndLeast TEST 02 - no numbers",  "FAILED");
		}

		
        // Test 3 //
	       
		outputStream.print("\r\n_____Test 03____________________________________________________________________________\r\n");
		
		userInput = String.format("-1%s2%s-8%s-9%s3%s-99",sep, sep, sep, sep, sep);
		expectedOutput = "(?si).*?ERROR.*?ERROR.*?ERROR.*?largest.*?3.*?smallest.*?2.*";
		outputStream.print("\r\nInput:\r\n");
		outputStream.println(userInput);
		outputStream.print("\r\nExpected output must fit RegEx:\r\n");
		outputStream.println("\""+expectedOutput+"\"");

	    bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);
	    baos = new ByteArrayOutputStream();
	    printStream = new PrintStream(baos);
	    System.setOut(printStream);
	   
	    GreatestAndLeast.main(null);

		actual = baos.toString();
		printStream.close();

		outputStream.print("\r\nActual Output:\r\n");
		outputStream.println("\""+actual+"\"");
		outputStream.println();
		if(Pattern.matches(expectedOutput, actual))
		{	
			outputStream.printf("%-80s%-10s\r\n", "GreatestAndLeast TEST 03 - negative numbers in input",  "PASSED");
			count++;		
		}
		else
		{
			outputStream.printf("%-80s%-10s\r\n", "GreatestAndLeast TEST 03 - negative numbers in input",  "FAILED");
		}

        // Test 4 //
	       
		outputStream.print("\r\n_____Test 04____________________________________________________________________________\r\n");
		
		userInput = String.format("-9%s-1%s-99",sep, sep);
		expectedOutput = "(?si).*?ERROR.*?ERROR.*?No numbers were entered.*";
		outputStream.print("\r\nInput:\r\n");
		outputStream.println(userInput);
		outputStream.print("\r\nExpected output must fit RegEx:\r\n");
		outputStream.println("\""+expectedOutput+"\"");

	    bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);
	    baos = new ByteArrayOutputStream();
	    printStream = new PrintStream(baos);
	    System.setOut(printStream);
	   
	    GreatestAndLeast.main(null);

		actual = baos.toString();
		printStream.close();

		outputStream.print("\r\nActual Output:\r\n");
		outputStream.println("\""+actual+"\"");
		outputStream.println();
		if(Pattern.matches(expectedOutput, actual))
		{	
			outputStream.printf("%-80s%-10s\r\n", "GreatestAndLeast TEST 04 - Negative input, no numbers",  "PASSED");
			count++;		
		}
		else
		{
			outputStream.printf("%-80s%-10s\r\n", "GreatestAndLeast TEST 04 - Negative input, no numbers",  "FAILED");
		}
		outputStream.print("\r\n++++ 4 Tests of GreatestAndLeast COMPLETE +++++++++++++++++++++++++++\r\n");
		System.setOut(standard);
        if (count==expectedCount) return true;
        else return false;
	}
}
