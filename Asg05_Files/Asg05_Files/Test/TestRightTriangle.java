import java.io.PrintWriter;

public class TestRightTriangle {

    public static boolean tests(PrintWriter outputStream)
    { 
        outputStream.println("\r\n----RightTriangle Class TESTS -------------------------------------------------------\r\n");
        boolean t1 = test01TriangleClass(outputStream);
        boolean t2 = test02TriangleClass(outputStream);
        boolean t3 = test03TriangleClass(outputStream); 
        return t1&&t2&&t3;
    }
    
    
    // set, get, throwing exceptions
    
    public static boolean test01TriangleClass(PrintWriter outputStream)
    {
        int count = 0;
        int expectedCount = 3;
        
        
        double a1 = 10.1, b1 = 15.1; // legs for the set  method tests
        double aa1 = 10.1, bb1 = 15.1; // expected values for set method tests
        
        double a2 = -5, b2 = -5; // values for testting exceptions
        
//Test #1          
        RightTriangle tri1 = new RightTriangle();
        tri1.setLegA(a1);
        tri1.setLegB(b1);
        if(tri1.getLegA()==aa1 && tri1.getLegB()== bb1) 
        {
            outputStream.printf("%-80s%-10s\n", "RightTriangle TEST SET 01: setetters and getters",  "PASSED");
            count++;
            
        }
        else  outputStream.printf("%-80s%-10s\n", "RightTriangle TEST SET 01: setetters and getters",  "FAILED");
 //Test #2  
        try
        {
            tri1.setLegA(a2);
            outputStream.printf("%-80s%-10s\n", "RightTriangle TEST SET 01: setLegA and exception it must throw",  "FAILED");
        }
        catch (IllegalArgumentException e)
        {
             outputStream.printf("%-80s%-10s\n", "RightTriangle TEST SET 01: setLegA and exception it must throw",  "PASSED");
             count++;
        }
 //Test #3
        try
        {
            tri1.setLegB(b2);
            outputStream.printf("%-80s%-10s\n", "RightTriangle TEST SET 01: setLegB and exception it must throw",  "FAILED");
        }
        catch (IllegalArgumentException e)
        {
             outputStream.printf("%-80s%-10s\n", "RightTriangle TEST SET 01: setLegB and exception it must throw",  "PASSED");
             count++;
        }
        
        if (count==expectedCount) return true;
        else return false;
    }
    
    // constructors and exceptions
    public static boolean test02TriangleClass(PrintWriter outputStream)
    {
        int count = 0;
        int expectedCount = 2;
        
        
        double a1 = 10.5, b1 = 15.3; // legs for constructor with parameters
        double aa1 = 10.5, bb1 = 15.3; // expected values to be set by constructor
        
        double aa2 = 1, bb2 = 1; // values for testing default constructor
        
        double a3 = -51, b3 = -8; // values for testing exceptions

 //Test #1       
        RightTriangle tri1 = new RightTriangle(a1, b1);
  
        if(tri1.getLegA()==aa1 && tri1.getLegB()== bb1) 
        {
            outputStream.printf("%-80s%-10s\n", "RightTriangle TEST SET 02: constructor with parameters",  "PASSED");
            count++;       
        }
        else  outputStream.printf("%-80s%-10s\n", "RightTriangle TEST SET 02: constructor with parameters",  "FAILED");
//Test #2        
        RightTriangle tri2 = new RightTriangle();
  
        if(tri2.getLegA()==aa2 && tri2.getLegB()== bb2) 
        {
            outputStream.printf("%-80s%-10s\n", "RightTriangle TEST SET 02: no-argument constructor",  "PASSED");
            count++;
        }
        else  outputStream.printf("%-80s%-10s\n", "RightTriangle TEST SET 02: no-argument constructor",  "FAILED");
//Test #3        
        try
        {
        	tri1 = new RightTriangle(-1, 1);
        	tri1 = new RightTriangle(0, 1);
            outputStream.printf("%-80s%-10s\n", "RightTriangle TEST SET 02: constructor exception non-positive first param",  "FAILED");
        }
        catch (IllegalArgumentException e)
        {
            outputStream.printf("%-80s%-10s\n", "RightTriangle TEST SET 02: constructor exception non-positive first param",  "PASSED");
            count++;
        }
//Test #4
        try
        {
        	tri1 = new RightTriangle(1, -1);
        	tri1 = new RightTriangle(1, 0);
            outputStream.printf("%-80s%-10s\n", "RightTriangle TEST SET 02: constructor exception non-positive second param",  "FAILED");
        }
        catch (IllegalArgumentException e)
        {
            outputStream.printf("%-80s%-10s\n", "RightTriangle TEST SET 02: constructor exception non-positive second param",  "PASSED");
            count++;
        }

        if (count==expectedCount) return true;
        else return false;
    }
    // area, hypotenuse, perimeter, toString()

    public static boolean test03TriangleClass(PrintWriter outputStream)
    {   
        int count = 0;
        int expectedCount = 2;
        
        
        double a1 = 3, b1 = 4; // legs 
        double hyp = 5;// expected hypotenuse 
        double perim = 12; // expected perimeter
        double area = 6; // expected area
        String str = "legA = 3.0, legB = 4.0"; // expected toString() result
        
        RightTriangle tri1 = new RightTriangle();
        tri1.setLegA(a1);
        tri1.setLegB(b1);
  
        if(tri1.getArea() == area && tri1.getHypotenuse() == hyp && tri1.getPerimeter()==perim) 
        {
            outputStream.printf("%-80s%-10s\n", "RightTriangle TEST SET 03: area, hypotenuse, and perimeter calculations",  "PASSED");
            count++;
        }
        else  {
        	outputStream.printf("%-80s%-10s\n", "RightTriangle TEST SET 03: area, hypotenuse, and perimeter calculations",  "FAILED");
        }
   
        if(tri1.toString().equals(str)) 
        {
            outputStream.printf("%-80s%-10s\n", "RightTriangle TEST SET 03: Test for toString()",  "PASSED");
            count++;
        }
        else  {
        	outputStream.printf("%-80s%-10s\n", "RightTriangle TEST SET 03: Test for toString()",  "FAILED");
        }

        if (count==expectedCount) return true;
        else return false;
    }
}
