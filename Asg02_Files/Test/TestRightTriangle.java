import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.regex.Pattern;

public class TestRightTriangle {
    public static boolean tests(PrintWriter outputStream)
    {
        int count = 0;
        int expectedCount = 8;
        
        outputStream.print("\r\n----Tests for RightTriangle --------------------------------------------------------\r\n");

        // Test 1 //
        outputStream.print("\r\n____Test 01____________________________________________________________________________\r\n");
        String sep = System.lineSeparator();
        String userInput = String.format("-5.0%s3%s4", sep, sep);
        String expectedOutput = "(?si).*?ERROR.*?";
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
       
        RightTriangle.main(null);
        //System.out.println("End of Test");
        //String[] lines = baos.toString().split(System.lineSeparator());
        String actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "RightTriangle TEST 01 - first value negative",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "RightTriangle TEST 01 - first value negative",  "FAILED");
        }

        // Test 2//
        outputStream.print("\r\n____Test 02____________________________________________________________________________\r\n");

        userInput = String.format("5.0%s-33.3%s4", sep, sep);
        expectedOutput = "(?si).*?ERROR.*?";
        outputStream.print("\r\nInput:\r\n");
        outputStream.println(userInput);
        outputStream.print("\r\nExpected output must fit RegEx:\r\n");
        outputStream.println("\""+expectedOutput+"\"");
        
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        baos = new ByteArrayOutputStream();
        printStream = new PrintStream(baos);
        System.setOut(printStream);
       
        RightTriangle.main(null);
        //System.out.println("End of Test");
        //String[] lines = baos.toString().split(System.lineSeparator());
        actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "RightTriangle TEST 02 - second value negative",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "RightTriangle TEST 02 - second value negative",  "FAILED");
        }

        // Test 3//
        outputStream.print("\r\n____Test 03____________________________________________________________________________\r\n");

        userInput = String.format("5.0%s3.0%s-4.0", sep, sep);
        expectedOutput = "(?si).*?ERROR.*?";
        outputStream.print("\r\nInput:\r\n");
        outputStream.println(userInput);
        outputStream.print("\r\nExpected output must fit RegEx:\r\n");
        outputStream.println("\""+expectedOutput+"\"");
        
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        baos = new ByteArrayOutputStream();
        printStream = new PrintStream(baos);
        System.setOut(printStream);
       
        RightTriangle.main(null);
        //System.out.println("End of Test");
        //String[] lines = baos.toString().split(System.lineSeparator());
        actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "RightTriangle TEST 03 - third value negative",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "RightTriangle TEST 03 - third value negative",  "FAILED");
        }
        
        // Test 4//
        outputStream.print("\r\n____Test 04____________________________________________________________________________\r\n");

        userInput = String.format("5.0%s3.0%s4.0", sep, sep);
        expectedOutput = "(?si).*?RIGHT.*?5\\.0\\^2 = .*";
        outputStream.print("\r\nInput:\r\n");
        outputStream.println(userInput);
        outputStream.print("\r\nExpected output must fit RegEx:\r\n");
        outputStream.println("\""+expectedOutput+"\"");
        
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        baos = new ByteArrayOutputStream();
        printStream = new PrintStream(baos);
        System.setOut(printStream);
       
        RightTriangle.main(null);

        actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "RightTriangle TEST 04 - right triangle with sides 5.0, 3.0, 4.0",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "RightTriangle TEST 04 - right triangle with sides 5.0, 3.0, 4.0",  "FAILED");
        }
        
        // Test 5//
        outputStream.print("\r\n____Test 05____________________________________________________________________________\r\n");

        userInput = String.format("3.0%s4.0%s5.0", sep, sep);
        expectedOutput = "(?si).*?RIGHT.*?5\\.0\\^2 = .*";
        outputStream.print("\r\nInput:\r\n");
        outputStream.println(userInput);
        outputStream.print("\r\nExpected output must fit RegEx:\r\n");
        outputStream.println("\""+expectedOutput+"\"");
        
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        baos = new ByteArrayOutputStream();
        printStream = new PrintStream(baos);
        System.setOut(printStream);
       
        RightTriangle.main(null);

        actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "RightTriangle TEST 05 - right triangle with sides 3.0, 4.0, 5.0",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "RightTriangle TEST 05 - right triangle with sides 3.0, 4.0, 5.0",  "FAILED");
        }
        // Test 6//
        outputStream.print("\r\n____Test 06____________________________________________________________________________\r\n");

        userInput = String.format("4.0%s5.0%s3.0", sep, sep);
        expectedOutput = "(?si).*?RIGHT.*?5\\.0\\^2 = .*";
        outputStream.print("\r\nInput:\r\n");
        outputStream.println(userInput);
        outputStream.print("\r\nExpected output must fit RegEx:\r\n");
        outputStream.println("\""+expectedOutput+"\"");
        
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        baos = new ByteArrayOutputStream();
        printStream = new PrintStream(baos);
        System.setOut(printStream);
       
        RightTriangle.main(null);
 
        actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "RightTriangle TEST 06 - right triangle with sides 4.0, 5.0, 3.0",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "RightTriangle TEST 06 - right triangle with sides 4.0, 5.0, 3.0",  "FAILED");
        }    
        
        
        // Test 7//
        outputStream.print("\r\n____Test 07____________________________________________________________________________\r\n");

        userInput = String.format("12.0%s9.0%s15.0", sep, sep);
        expectedOutput = "(?si).*?RIGHT.*?15\\.0\\^2 = .*";
        outputStream.print("\r\nInput:\r\n");
        outputStream.println(userInput);
        outputStream.print("\r\nExpected output must fit RegEx:\r\n");
        outputStream.println("\""+expectedOutput+"\"");
        
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        baos = new ByteArrayOutputStream();
        printStream = new PrintStream(baos);
        System.setOut(printStream);
       
        RightTriangle.main(null);
 
        actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "RightTriangle TEST 07 - right triangle with sides 12.0, 9.0, 15.0",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "RightTriangle TEST 07 - right triangle with sides 12.0, 9.0, 15.0",  "FAILED");
        }    
        
        // Test 7//
        outputStream.print("\r\n____Test 08____________________________________________________________________________\r\n");

        userInput = String.format("12.0%s19.0%s15.0", sep, sep);
        expectedOutput = "(?si).*?NOT .*";
        outputStream.print("\r\nInput:\r\n");
        outputStream.println(userInput);
        outputStream.print("\r\nExpected output must fit RegEx:\r\n");
        outputStream.println("\""+expectedOutput+"\"");
        
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        baos = new ByteArrayOutputStream();
        printStream = new PrintStream(baos);
        System.setOut(printStream);
       
        RightTriangle.main(null);
 
        actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "RightTriangle TEST 08 - right triangle with sides 12.0, 9.0, 15.0",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "RightTriangle TEST 08 - right triangle with sides 12.0, 9.0, 15.0",  "FAILED");
        }    
        
        outputStream.print("\r\n++++ 8 Tests of RightTriangle COMPLETE +++++++++++++++++++++++++++\r\n");
        System.setOut(standard);
        if (count==expectedCount) return true;
        else return false;
    }
}
