import java.io.PrintWriter;

public class TestLongInteger {
    public static boolean tests(PrintWriter outputStream)
    { 
        outputStream.println("\r\n----LongInteger Class TEST SETS -------------------------------------------------------\r\n");
        boolean t1 = test01LongIntegerClass(outputStream);
        boolean t2 = test02LongIntegerClass(outputStream);
        boolean t3 = test03LongIntegerClass(outputStream);
        return t1&&t2&&t3;
    }
	
    public static boolean test01LongIntegerClass(PrintWriter outputStream)
    { 
        int count = 0;
        int expectedCount = 3;
        
        int a = 55;
        int b = 102;
        int prime = 97;
        
 //Test #1       
        LongInteger num1 = new LongInteger(a);
        if(num1.toLong()==a)
        {
            outputStream.printf("%-80s%-10s\n", "LongInteger TEST SET 01: constructor",  "PASSED");
            count++;
        }
        else  outputStream.printf("%-80s%-10s\n", "LongInteger TEST SET 01: constructor",  "FAILED");
  //Test #2       
        LongInteger num2 = new LongInteger(b);
        
        if(!num1.isEven()&& num1.isOdd()&& num2.isEven() && !num2.isOdd())
        {
            outputStream.printf("%-80s%-10s\n", "LongInteger TEST SET 01: isEven() and isOdd()",  "PASSED");
            count++;
        }
        else   outputStream.printf("%-80s%-10s\n", "LongInteger TEST SET 01: isEven() and isOdd()",  "FAILED");
  //Test #3           
        LongInteger num3 = new LongInteger(prime);
        if(num3.isPrime() && !num2.isPrime() && !num1.isPrime())
        {
            outputStream.printf("%-80s%-10s\n", "LongInteger TEST SET 01: isPrime()",  "PASSED");
            count++;
        }
        else  outputStream.printf("%-80s%-10s\n", "LongInteger TEST SET 01: isPrime()",  "FAILED");
        
        if (count==expectedCount) return true;
        else return false;

    }
    
    public static boolean test02LongIntegerClass(PrintWriter outputStream)
    { 
        int count = 0;
        int expectedCount = 3;
        
        
        int a = 103;
        int b = 500;
        int prime = 919;
        
//Test #1          
        if(!LongInteger.isEven(a)&& LongInteger.isOdd(a)&& LongInteger.isEven(b) && !LongInteger.isOdd(b))
        {
            outputStream.printf("%-80s%-10s\n", "LongInteger TEST SET 02: static isEven() and static isOdd()",  "PASSED");
            count++;
        }
        else  outputStream.printf("%-80s%-10s\n", "LongInteger TEST SET 02: static isEven() and static isOdd()",  "FAILED");
//Test #2          
        if(LongInteger.isPrime(prime) && LongInteger.isPrime(a) && !LongInteger.isPrime(b))
        {
            outputStream.printf("%-80s%-10s\n", "LongInteger TEST SET 02: static isPrime()",  "PASSED");
            count++;
        }
        else  outputStream.printf("%-80s%-10s\n", "LongInteger TEST SET 02: static isPrime()",  "FAILED");
//Test #3        
        LongInteger num1 = new LongInteger(a);
        LongInteger num2 = new LongInteger(a);
        LongInteger num3 = new LongInteger(b);
        
        if(num1.equals(a) && !num1.equals(b) && num1.equals(num2) && !num3.equals(num1))
        {
            outputStream.printf("%-80s%-10s\n", "LongInteger TEST SET 02: both equals methods",  "PASSED");
            count++; 
        }
        else  outputStream.printf("%-80s%-10s\n", "LongInteger TEST SET 02: both equals methods",  "FAILED");      
        
         
        
        if (count==expectedCount) return true;
        else return false;
        
    }
    
    public static boolean test03LongIntegerClass(PrintWriter outputStream)
    { 
      
        int count = 0;
        int expectedCount = 4;


//Test #1       
       if(LongInteger.parseLong("9223372036854775807") == 9223372036854775807L && LongInteger.parseLong("12") == 12 && LongInteger.parseLong("0") == 0)
        {
            outputStream.printf("%-80s%-10s\n", "LongInteger TEST SET 03: parseLong() with valid positive values",  "PASSED");
            count++; 
        }
        else  outputStream.printf("%-80s%-10s\n", "LongInteger TEST SET 03: parseLong() with valid positive values",  "FAILED");  
//Test #2       
       if(LongInteger.parseLong("-54321") == -54321 && LongInteger.parseLong("-9223372036854775808") == -9223372036854775808L && LongInteger.parseLong("-3") == -3)
        {
            outputStream.printf("%-80s%-10s\n", "LongInteger TEST SET 03: parseLong() with valid negative values",  "PASSED");
            count++; 
        }
        else outputStream.printf("%-80s%-10s\n", "LongInteger TEST SET 03: parseLong() with valid negative values",  "FAILED");
//Test #3
       try // overflow detection test
        {
            long k = LongInteger.parseLong("9223372036854775808");
             outputStream.printf("%-80s%-10s\n", "LongInteger TEST SET 03: parseLong() overflow",  "FAILED");
        }
        catch(IllegalArgumentException e)
        {
            outputStream.printf("%-80s%-10s\n", "LongInteger TEST SET 03: parseLong() overflow",  "PASSED");
            count++; 
        }
//Test #4        
        try // underflow detection test
        {
            long k = LongInteger.parseLong("-9223372036854775809");
            outputStream.printf("%-80s%-10s\n", "LongInteger TEST SET 03: parseLong() underflow",  "FAILED"); 
        }
        catch(IllegalArgumentException e)
        {
            outputStream.printf("%-80s%-10s\n", "LongInteger TEST SET 03: parseLong() underflow",  "PASSED");
            count++; 
        }
//Test #5
        try // non-digit characters detection test
        {
            long k = LongInteger.parseLong("456a7");
            outputStream.printf("%-80s%-10s\n", "LongInteger TEST SET 03: parseLong() invalid digits",  "FAILED");
        }
        catch(IllegalArgumentException e)
        {
            outputStream.printf("%-80s%-10s\n", "LongInteger TEST SET 03: parseLong() invalid digits",  "PASSED");
            count++; 
        }
//Test #6
        try // non-digit characters detection test (special case)
        {
            long k = LongInteger.parseLong("-");
            outputStream.printf("%-80s%-10s\n", "LongInteger TEST SET 03: parseLong() invalid digits (just '-')",  "FAILED");
        }
        catch(IllegalArgumentException e)
        {
            outputStream.printf("%-80s%-10s\n", "LongInteger TEST SET 03: parseLong() invalid digits (just '-')",  "PASSED");
            count++; 
        }
        outputStream.println("\nREMINDER! You are not allowed to use any standard parsing method like Long.parseLong() when coding up LongInteger.parseLong(). ");
       
        if (count==expectedCount) return true;
        else return false;
    }
}
