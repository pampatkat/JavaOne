import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.regex.Pattern;

public class TestBridgeToll520 {
    public static boolean tests(PrintWriter outputStream)
    {
        int count = 0;
        int expectedCount = 19;
        
        outputStream.print("\r\n----Tests for BridgeToll520 --------------------------------------------------------\r\n");

        // Test 1 //
        outputStream.print("\r\n____Test 01____________________________________________________________________________\r\n");
        String sep = System.lineSeparator();
        String userInput = String.format("0%s1%sam", sep, sep);
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
       
        BridgeToll520.main(null);
 
        String actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 01 - invalid hours value",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 01 - invalid hours value",  "FAILED");
        }

        // Test 2//
        outputStream.print("\r\n____Test 02____________________________________________________________________________\r\n");

        userInput = String.format("13%s1%sam", sep, sep);
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
       
        BridgeToll520.main(null);

        actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 02 - invalid hours value",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 02 - invalid hours value",  "FAILED");
        }

        // Test 3//
        outputStream.print("\r\n____Test 03____________________________________________________________________________\r\n");

        userInput = String.format("1%s-1%sam", sep, sep);
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
       
        BridgeToll520.main(null);

        actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 03 - invalid minutes value",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 03 - invalid minutes value",  "FAILED");
        }

        // Test 4//
        outputStream.print("\r\n____Test 04____________________________________________________________________________\r\n");

        userInput = String.format("1%s60%sam", sep, sep);
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
       
        BridgeToll520.main(null);

        actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 04 - invalid minutes value",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 04 - invalid minutes value",  "FAILED");
        }

        // Test 5//
        outputStream.print("\r\n____Test 05____________________________________________________________________________\r\n");

        userInput = String.format("1%s60%sAm", sep, sep);
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
       
        BridgeToll520.main(null);

        actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 05 - invalid am/pm value",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 05 - invalid am/pm value",  "FAILED");
        }
        
        // Test 6//
        outputStream.print("\r\n____Test 06____________________________________________________________________________\r\n");
        userInput = String.format("12%s1%sam", sep, sep);
        expectedOutput = "(?si).*?Charge:.*?1\\.25.*";
        outputStream.print("\r\nInput:\r\n");
        outputStream.println(userInput);
        outputStream.print("\r\nExpected output must fit RegEx:\r\n");
        outputStream.println("\""+expectedOutput+"\"");
        
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        baos = new ByteArrayOutputStream();
        printStream = new PrintStream(baos);
        System.setOut(printStream);
       
        BridgeToll520.main(null);

        actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 06 - $1.25 charge",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 06 - $1.25 charge",  "FAILED");
        }
 
        // Test 7//
        outputStream.print("\r\n____Test 07____________________________________________________________________________\r\n");
        userInput = String.format("4%s59%sam", sep, sep);
        expectedOutput = "(?si).*?Charge:.*?1\\.25.*";
        outputStream.print("\r\nInput:\r\n");
        outputStream.println(userInput);
        outputStream.print("\r\nExpected output must fit RegEx:\r\n");
        outputStream.println("\""+expectedOutput+"\"");
        
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        baos = new ByteArrayOutputStream();
        printStream = new PrintStream(baos);
        System.setOut(printStream);
       
        BridgeToll520.main(null);

        actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 07 - $1.25 charge",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 07 - $1.25 charge",  "FAILED");
        }
   
        // Test 8//
        outputStream.print("\r\n____Test 08____________________________________________________________________________\r\n");
        userInput = String.format("11%s59%spm", sep, sep);
        expectedOutput = "(?si).*?Charge:.*?1\\.25.*";
        outputStream.print("\r\nInput:\r\n");
        outputStream.println(userInput);
        outputStream.print("\r\nExpected output must fit RegEx:\r\n");
        outputStream.println("\""+expectedOutput+"\"");
        
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        baos = new ByteArrayOutputStream();
        printStream = new PrintStream(baos);
        System.setOut(printStream);
       
        BridgeToll520.main(null);

        actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 08 - $1.25 charge",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 08 - $1.25 charge",  "FAILED");
        }       
        
        // Test 9//
        outputStream.print("\r\n____Test 09____________________________________________________________________________\r\n");
        userInput = String.format("5%s0%sam", sep, sep);
        expectedOutput = "(?si).*?Charge:.*?1\\.40.*";
        outputStream.print("\r\nInput:\r\n");
        outputStream.println(userInput);
        outputStream.print("\r\nExpected output must fit RegEx:\r\n");
        outputStream.println("\""+expectedOutput+"\"");
        
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        baos = new ByteArrayOutputStream();
        printStream = new PrintStream(baos);
        System.setOut(printStream);
       
        BridgeToll520.main(null);

        actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 09 - $1.40 charge",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 09 - $1.40 charge",  "FAILED");
        }  
 
        // Test 10//
        outputStream.print("\r\n____Test 10____________________________________________________________________________\r\n");
        userInput = String.format("7%s59%sam", sep, sep);
        expectedOutput = "(?si).*?Charge:.*?1\\.40.*";
        outputStream.print("\r\nInput:\r\n");
        outputStream.println(userInput);
        outputStream.print("\r\nExpected output must fit RegEx:\r\n");
        outputStream.println("\""+expectedOutput+"\"");
        
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        baos = new ByteArrayOutputStream();
        printStream = new PrintStream(baos);
        System.setOut(printStream);
       
        BridgeToll520.main(null);

        actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 10 - $1.40 charge",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 10 - $1.40 charge",  "FAILED");
        }  
        
        // Test 11//
        outputStream.print("\r\n____Test 11____________________________________________________________________________\r\n");
        userInput = String.format("9%s1%spm", sep, sep);
        expectedOutput = "(?si).*?Charge:.*?1\\.40.*";
        outputStream.print("\r\nInput:\r\n");
        outputStream.println(userInput);
        outputStream.print("\r\nExpected output must fit RegEx:\r\n");
        outputStream.println("\""+expectedOutput+"\"");
        
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        baos = new ByteArrayOutputStream();
        printStream = new PrintStream(baos);
        System.setOut(printStream);
       
        BridgeToll520.main(null);

        actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 11 - $1.40 charge",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 11 - $1.40 charge",  "FAILED");
        }  
        
        // Test 12//
        outputStream.print("\r\n____Test 12____________________________________________________________________________\r\n");
        userInput = String.format("10%s59%spm", sep, sep);
        expectedOutput = "(?si).*?Charge:.*?1\\.40.*";
        outputStream.print("\r\nInput:\r\n");
        outputStream.println(userInput);
        outputStream.print("\r\nExpected output must fit RegEx:\r\n");
        outputStream.println("\""+expectedOutput+"\"");
        
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        baos = new ByteArrayOutputStream();
        printStream = new PrintStream(baos);
        System.setOut(printStream);
       
        BridgeToll520.main(null);

        actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 12 - $1.40 charge",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 12 - $1.40 charge",  "FAILED");
        }  
        
        // Test 13//
        outputStream.print("\r\n____Test 13____________________________________________________________________________\r\n");
        userInput = String.format("8%s01%sam", sep, sep);
        expectedOutput = "(?si).*?Charge:.*?2\\.05.*";
        outputStream.print("\r\nInput:\r\n");
        outputStream.println(userInput);
        outputStream.print("\r\nExpected output must fit RegEx:\r\n");
        outputStream.println("\""+expectedOutput+"\"");
        
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        baos = new ByteArrayOutputStream();
        printStream = new PrintStream(baos);
        System.setOut(printStream);
       
        BridgeToll520.main(null);

        actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 13 - $2.05 charge",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 13 - $2.05 charge",  "FAILED");
        }  
 
        // Test 14//
        outputStream.print("\r\n____Test 14____________________________________________________________________________\r\n");
        userInput = String.format("10%s58%sam", sep, sep);
        expectedOutput = "(?si).*?Charge:.*?2\\.05.*";
        outputStream.print("\r\nInput:\r\n");
        outputStream.println(userInput);
        outputStream.print("\r\nExpected output must fit RegEx:\r\n");
        outputStream.println("\""+expectedOutput+"\"");
        
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        baos = new ByteArrayOutputStream();
        printStream = new PrintStream(baos);
        System.setOut(printStream);
       
        BridgeToll520.main(null);

        actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 14 - $2.05 charge",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 14 - $2.05 charge",  "FAILED");
        }  
        
        
        // Test 15//
        outputStream.print("\r\n____Test 15____________________________________________________________________________\r\n");
        userInput = String.format("6%s2%spm", sep, sep);
        expectedOutput = "(?si).*?Charge:.*?2\\.05.*";
        outputStream.print("\r\nInput:\r\n");
        outputStream.println(userInput);
        outputStream.print("\r\nExpected output must fit RegEx:\r\n");
        outputStream.println("\""+expectedOutput+"\"");
        
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        baos = new ByteArrayOutputStream();
        printStream = new PrintStream(baos);
        System.setOut(printStream);
       
        BridgeToll520.main(null);

        actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 15 - $2.05 charge",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 15 - $2.05 charge",  "FAILED");
        }  
        
        // Test 16//
        outputStream.print("\r\n____Test 16____________________________________________________________________________\r\n");
        userInput = String.format("8%s58%spm", sep, sep);
        expectedOutput = "(?si).*?Charge:.*?2\\.05.*";
        outputStream.print("\r\nInput:\r\n");
        outputStream.println(userInput);
        outputStream.print("\r\nExpected output must fit RegEx:\r\n");
        outputStream.println("\""+expectedOutput+"\"");
        
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        baos = new ByteArrayOutputStream();
        printStream = new PrintStream(baos);
        System.setOut(printStream);
       
        BridgeToll520.main(null);

        actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 16 - $2.05 charge",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 16 - $2.05 charge",  "FAILED");
        }      
        
        // Test 17//
        outputStream.print("\r\n____Test 17____________________________________________________________________________\r\n");
        userInput = String.format("11%s15%sam", sep, sep);
        expectedOutput = "(?si).*?Charge:.*?2\\.65.*";
        outputStream.print("\r\nInput:\r\n");
        outputStream.println(userInput);
        outputStream.print("\r\nExpected output must fit RegEx:\r\n");
        outputStream.println("\""+expectedOutput+"\"");
        
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        baos = new ByteArrayOutputStream();
        printStream = new PrintStream(baos);
        System.setOut(printStream);
       
        BridgeToll520.main(null);

        actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 17 - $2.65 charge",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 17 - $2.65 charge",  "FAILED");
        } 
        
        // Test 18//
        outputStream.print("\r\n____Test 18____________________________________________________________________________\r\n");
        userInput = String.format("12%s0%spm", sep, sep);
        expectedOutput = "(?si).*?Charge:.*?2\\.65.*";
        outputStream.print("\r\nInput:\r\n");
        outputStream.println(userInput);
        outputStream.print("\r\nExpected output must fit RegEx:\r\n");
        outputStream.println("\""+expectedOutput+"\"");
        
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        baos = new ByteArrayOutputStream();
        printStream = new PrintStream(baos);
        System.setOut(printStream);
       
        BridgeToll520.main(null);

        actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 18 - $2.65 charge",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 18 - $2.65 charge",  "FAILED");
        }  
        
        // Test 19//
        outputStream.print("\r\n____Test 19____________________________________________________________________________\r\n");
        userInput = String.format("4%s58%spm", sep, sep);
        expectedOutput = "(?si).*?Charge:.*?2\\.65.*";
        outputStream.print("\r\nInput:\r\n");
        outputStream.println(userInput);
        outputStream.print("\r\nExpected output must fit RegEx:\r\n");
        outputStream.println("\""+expectedOutput+"\"");
        
        bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        baos = new ByteArrayOutputStream();
        printStream = new PrintStream(baos);
        System.setOut(printStream);
       
        BridgeToll520.main(null);

        actual = baos.toString();
        printStream.close();

        outputStream.print("\r\nActual Output:\r\n");
        outputStream.println("\""+actual+"\"");
        outputStream.println();
        if(Pattern.matches(expectedOutput, actual))
        {   
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 19 - $2.65 charge",  "PASSED");
            count++;        
        }
        else
        {
            outputStream.printf("%-80s%-10s\r\n", "BridgeToll520 TEST 19 - $2.65 charge",  "FAILED");
        }   
        
        outputStream.print("\r\n++++ 19 Tests of BridgeToll520 COMPLETE +++++++++++++++++++++++++++\r\n");
        System.setOut(standard);
        if (count==expectedCount) return true;
        else return false;
    }
}
