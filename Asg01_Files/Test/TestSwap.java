import java.io.*;


public class TestSwap {

	public static boolean tests(PrintWriter outputStream)
	{
        int count = 0;
        int expectedCount = 2;
        
        outputStream.print("\r\n----Tests of Swap----------------------------------------\r\n");

        // Test 1 //
        outputStream.print("\r\n____Test 01_______________________________________________________\r\n");
        
		String userInput = String.format("10%s20",System.lineSeparator());
		String expectedOutput = "After swapping, the values of the two numbers are 20.0 and 10.0";
		outputStream.print("\r\nInput:\r\n");
		outputStream.println(userInput);
		outputStream.print("\r\nExpected Output:\r\n");
		outputStream.println("\""+expectedOutput+"\"");

		PrintStream standard = System.out;
	    ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream printStream = new PrintStream(baos);
	    System.setOut(printStream);
	   
		Swap.main(null);
		//System.out.println("End of Test");
		String[] lines = baos.toString().split(System.lineSeparator());
		String actual = lines[lines.length-1];
		printStream.close();

		outputStream.print("\r\nActual Output:\r\n");
		outputStream.println("\""+actual+"\"");
		outputStream.println();
		if(actual.equals(expectedOutput))
		{	
			outputStream.printf("%-50s%-10s\r\n", "Swap TEST 01",  "PASSED");
			count++;		
		}
		else
		{
			outputStream.printf("%-50s%-10s\r\n", "Swap TEST 01",  "FAILED");
		}
		
        // Test 2 //
       
		outputStream.print("\r\n____Test 02_______________________________________________________\r\n");
		
		userInput = String.format("3%s5",System.lineSeparator());
		expectedOutput = "After swapping, the values of the two numbers are 5.0 and 3.0";
		outputStream.print("\r\nInput:\r\n");
		outputStream.println(userInput);
		outputStream.print("\r\nExpected Output:\r\n");
		outputStream.println("\""+expectedOutput+"\"");
		
	    bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);
	    baos = new ByteArrayOutputStream();
	    printStream = new PrintStream(baos);
	    System.setOut(printStream);
	   
		Swap.main(null);
		lines = baos.toString().split(System.lineSeparator());
		actual = lines[lines.length-1];
		printStream.close();

		outputStream.print("\r\nActual Output:\r\n");
		outputStream.println("\""+actual+"\"");
		outputStream.println();
		if(actual.equals(expectedOutput))
		{	
			outputStream.printf("%-50s%-10s\r\n", "Swap TEST 02",  "PASSED");
			count++;		
		}
		else
		{
			outputStream.printf("%-50s%-10s\r\n", "Swap TEST 02",  "FAILED");
		}
      
      outputStream.print("\r\n++++ 2 Tests of Swap COMPLETE +++++++++++++++++++++++++++\r\n");

		System.setOut(standard);
        if (count==expectedCount) return true;
        else return false;
	
	}
}
