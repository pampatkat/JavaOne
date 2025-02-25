import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.regex.Pattern;

public class TestInterestEarned {
	public static boolean tests(PrintWriter outputStream)
	{
        int count = 0;
        int expectedCount = 2;
        
        outputStream.print("\r\n----Tests of InterestEarned----------------------------------------\r\n");

        // Test 1 //
        outputStream.print("\r\n____Test 01_______________________________________________________\r\n");
		String userInput = String.format("1000%s4.25%s12",System.lineSeparator(), System.lineSeparator());
		String expectedOutput = "(?si).*?4.25.*?12.*?1000.*?43.34.*?1043.34.*";
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
	   
	    InterestEarned.main(null);
		//System.out.println("End of Test");
		//String[] lines = baos.toString().split(System.lineSeparator());
		String actual = baos.toString();
		printStream.close();

		outputStream.print("\r\nActual Output:\r\n");
		outputStream.println("\""+actual+"\"");
		outputStream.println();
		if(Pattern.matches(expectedOutput, actual))
		{	
			outputStream.printf("%-50s%-10s\r\n", "InterestEarned TEST 01",  "PASSED");
			count++;		
		}
		else
		{
			outputStream.printf("%-50s%-10s\r\n", "InterestEarned TEST 01",  "FAILED");
		}
		
        // Test 2 //
		outputStream.print("\r\n____Test 02_______________________________________________________\r\n");
		
		userInput = String.format("1000%s5%s2",System.lineSeparator(), System.lineSeparator());
		expectedOutput = "(?si).*?5.0.*?2.*?1000.*?50.63.*?1050.63.*";
		outputStream.print("\r\nInput:\r\n");
		outputStream.println(userInput);
		outputStream.print("\r\nExpected output must fit RegEx:\r\n");
		outputStream.println("\""+expectedOutput+"\"");
		
	    bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);
	    baos = new ByteArrayOutputStream();
	    printStream = new PrintStream(baos);
	    System.setOut(printStream);
	   
		InterestEarned.main(null);

		actual = baos.toString();
		printStream.close();

		outputStream.print("\r\nActual Output:\r\n");
		outputStream.println("\""+actual+"\"");
		outputStream.println();
		if(Pattern.matches(expectedOutput, actual))
		{	
			outputStream.printf("%-50s%-10s\r\n", "InterestEarned TEST 02",  "PASSED");
			count++;		
		}
		else
		{
			outputStream.printf("%-50s%-10s\r\n", "InterestEarned TEST 02",  "FAILED");
		}
      outputStream.print("\r\n++++ 2 Tests of InterestEarned COMPLETE +++++++++++++++++++++++++++\r\n");

		System.setOut(standard);
        if (count==expectedCount) return true;
        else return false;
	}
}
