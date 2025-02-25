import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.regex.Pattern;

public class TestDigitSum {
	public static boolean tests(PrintWriter outputStream)
	{
        int count = 0;
        int expectedCount = 3;
        
        outputStream.print("\r\n----Tests for DigitSum--------------------------------------------------------\r\n");

        // Test 1 //
        outputStream.print("\r\n____Test 01____________________________________________________________________________\r\n");
        String sep = System.lineSeparator();
		String userInput = String.format("222222222");
		String expectedOutput = "(?si).*?222222222.*18.*";
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
	   
	    DigitSum.main(null);

		String actual = baos.toString();
		printStream.close();

		outputStream.print("\r\nActual Output:\r\n");
		outputStream.println("\""+actual+"\"");
		outputStream.println();
		if(Pattern.matches(expectedOutput, actual))
		{	
			outputStream.printf("%-80s%-10s\r\n", "DigitSum TEST 01 - valid positive integer",  "PASSED");
			count++;		
		}
		else
		{
			outputStream.printf("%-80s%-10s\r\n", "DigitSum TEST 01 - valid positive integer",  "FAILED");
		}

        // Test 2 //
       
		outputStream.print("\r\n_____Test 02____________________________________________________________________________\r\n");
		userInput = String.format("-112121");
		expectedOutput = "(?si).*?-112121.*8.*";
		outputStream.print("\r\nInput:\r\n");
		outputStream.println(userInput);
		outputStream.print("\r\nExpected output must fit RegEx:\r\n");
		outputStream.println("\""+expectedOutput+"\"");

	    bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);
	    baos = new ByteArrayOutputStream();
	    printStream = new PrintStream(baos);
	    System.setOut(printStream);
	   
	    DigitSum.main(null);

		actual = baos.toString();
		printStream.close();

		outputStream.print("\r\nActual Output:\r\n");
		outputStream.println("\""+actual+"\"");
		outputStream.println();
		if(Pattern.matches(expectedOutput, actual))
		{	
			outputStream.printf("%-80s%-10s\r\n", "DigitSum TEST 02 - valid negative integer",  "PASSED");
			count++;		
		}
		else
		{
			outputStream.printf("%-80s%-10s\r\n", "DigitSum TEST 02 - valid negative integer",  "FAILED");
		}

		
        // Test 3 //
	       
		outputStream.print("\r\n_____Test 03____________________________________________________________________________\r\n");
		userInput = String.format("abc%s9.33%s123",sep, sep);
		expectedOutput = "(?si).*?ERROR.*ERROR.*123.*6.*";
		outputStream.print("\r\nInput:\r\n");
		outputStream.println(userInput);
		outputStream.print("\r\nExpected output must fit RegEx:\r\n");
		outputStream.println("\""+expectedOutput+"\"");

	    bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);
	    baos = new ByteArrayOutputStream();
	    printStream = new PrintStream(baos);
	    System.setOut(printStream);
	   
	    DigitSum.main(null);

		actual = baos.toString();
		printStream.close();

		outputStream.print("\r\nActual Output:\r\n");
		outputStream.println("\""+actual+"\"");
		outputStream.println();
		if(Pattern.matches(expectedOutput, actual))
		{	
			outputStream.printf("%-80s%-10s\r\n", "DigitSum TEST 03 - invalid integer in input",  "PASSED");
			count++;		
		}
		else
		{
			outputStream.printf("%-80s%-10s\r\n", "DigitSum TEST 03 - invalid integer in input",  "FAILED");
		}


		
		outputStream.print("\r\n++++ 3 Tests of DigitSum COMPLETE +++++++++++++++++++++++++++\r\n");
		System.setOut(standard);
        if (count==expectedCount) return true;
        else return false;
	}
}
