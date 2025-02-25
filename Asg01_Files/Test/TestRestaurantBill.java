import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.regex.Pattern;

public class TestRestaurantBill {
	
	public static boolean tests(PrintWriter outputStream)
	{
        int count = 0;
        int expectedCount = 2;
        
        outputStream.print("\r\n----Tests of RestaurantBill----------------------------------------\r\n");

        // Test 1 //
        
        outputStream.print("\r\n____Test 01_______________________________________________________\r\n");
		String userInput = String.format("100%s20",System.lineSeparator());
		String expectedOutput = "(?si).*?100.*?10.*?22.*?132.*";
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
	   
	    RestaurantBill.main(null);
		//System.out.println("End of Test");
		//String[] lines = baos.toString().split(System.lineSeparator());
		String actual = baos.toString();
		printStream.close();

		outputStream.print("\r\nActual Output:\r\n");
		outputStream.println("\""+actual+"\"");
		outputStream.println();
		if(Pattern.matches(expectedOutput, actual))
		{	
			outputStream.printf("%-50s%-10s\r\n", "RestaurantBill TEST 01",  "PASSED");
			count++;		
		}
		else
		{
			outputStream.printf("%-50s%-10s\r\n", "RestaurantBill TEST 01",  "FAILED");
		}
		
        // Test 2 //
       
		outputStream.print("\r\n____Test 02_______________________________________________________\r\n");
		
		userInput = String.format("107%s15",System.lineSeparator());
		expectedOutput = "(?si).*?107.*?10\\.7.*?17\\.66.*?135\\.36.*";
      outputStream.print("\r\nInput:\r\n");
		outputStream.println(userInput);
		outputStream.print("\r\nExpected output must fit RegEx:\r\n");
		outputStream.println("\""+expectedOutput+"\"");
		
	    bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);
	    baos = new ByteArrayOutputStream();
	    printStream = new PrintStream(baos);
	    System.setOut(printStream);
	   
		RestaurantBill.main(null);
		//System.out.println("End of Test");
		actual = baos.toString();
		printStream.close();

		outputStream.print("\r\nActual Output:\r\n");
		outputStream.println("\""+actual+"\"");
		outputStream.println();
		if(Pattern.matches(expectedOutput, actual))
		{	
			outputStream.printf("%-50s%-10s\r\n", "RestaurantBill TEST 02",  "PASSED");
			count++;		
		}
		else
		{
			outputStream.printf("%-50s%-10s\r\n", "RestaurantBill TEST 02",  "FAILED");
		}
      
      outputStream.print("\r\n++++ 2 Tests of RestaurantBill COMPLETE +++++++++++++++++++++++++++\r\n");
		System.setOut(standard);
        if (count==expectedCount) return true;
        else return false;
	}
}
