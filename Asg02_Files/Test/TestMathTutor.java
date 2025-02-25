import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.regex.Pattern;

public class TestMathTutor {
	public static boolean tests(PrintWriter outputStream)
	{
        int count = 0;
        int expectedCount = 1;
        
        outputStream.print("\r\n----Tests for MathTutor----------------------------------------\r\n");

        // Test 1 //
        
        String sep = System.lineSeparator();
		String userInput = String.format("5%s1%s123%s10%s2%s123%s3",sep, sep, sep, sep, sep, sep, sep);
		String expectedOutput = "(?si).*?Math Tutor.*?ERROR.*?Math Tutor.*?\\+.*?ERROR.*?Math Tutor.*?\\-.*?Math Tutor.*";
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
	   
	    MathTutor.main(null);
	
		String actual = baos.toString();
		printStream.close();

		outputStream.print("\r\nActual Output:\r\n");
		outputStream.println("\""+actual+"\"");
		outputStream.println();
		if(Pattern.matches(expectedOutput, actual))
		{	
			outputStream.printf("%-50s%-10s\r\n", "MathTutor TEST 01 - partial tests",  "PASSED");
			count++;		
		}
		else
		{
			outputStream.printf("%-50s%-10s\r\n", "MathTutor TEST 01 - partial tests",  "FAILED");
		}
		
		outputStream.print("\r\n++++ 1 Test of MathTutor COMPLETE +++++++++++++++++++++++++++\r\n");
		outputStream.println("\nATTENTION! MathTutor must be tested manually. Make sure that \n"
				+ "1)Random numbers are in the correct range. \n"
				+ "2)Output formatted according to specs - the numbers aligned correctly and a number with more digits appear on top of the one with less digits.\n"
				+ "3)The code is commented thoroughly.");
 
		System.setOut(standard);
		
        if (count==expectedCount) return true;
        else return false;
	}
}
