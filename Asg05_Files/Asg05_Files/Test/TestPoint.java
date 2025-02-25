import java.io.PrintWriter;

public class TestPoint {
	
    public static boolean tests(PrintWriter outputStream)
    { 
 
    	outputStream.println("\r\n----Point Class TESTS -------------------------------------------------------\r\n");
    	boolean t1 = test01PointClass(outputStream);
    	boolean t2 = test02PointClass(outputStream);
        return t1&&t2;
 
    }

    public static boolean test01PointClass(PrintWriter outputStream)
    {
        int count = 0;
        int expectedCount = 2;
        
        
        double x1 = 33.1,  y1 = 44; // point  coordinates for setting
        double xx1 = 33.1, yy1= 44; //- expected point coordinates
 
//Test #1  
        Point point1 = new Point(); 
        point1.setX(x1);
        point1.setY(y1);
        if(point1.getX()==xx1 && point1.getY()== yy1) 
        {
            outputStream.printf("%-80s%-10s\n", "Point TEST SET 01: Test for set and get methods",  "PASSED");
            count++;
           
        }
        else  {
        	outputStream.printf("%-80s%-10s\n", "Point TEST SET 01: Test for set and get methods",  "FAILED");
        }

        double x11 = 1, y11= 1; //- expected point11 default coordinates

//Test #2
        Point point11 = new Point(); 
        if(point11.getX()==x11 && point11.getY()==y11) 
        {
            outputStream.printf("%-80s%-10s\n", "Point TEST SET 01: Test for non-argument constructor",  "PASSED");
            count++;
        }
        else  outputStream.printf("%-80s%-10s\n", "Point TEST SET 01: Test for non-argument constructor",  "FAILED");
        
        
        if (count==expectedCount) return true;
        else return false;
    }
    
  
    
    public static boolean test02PointClass(PrintWriter outputStream)
    {
        int count = 0;
        int expectedCount = 3;
        
		
        double x2 = -925.5, y2 = 6; // point2  coordinates
        double xx2 = -925.5, yy2= 6; //- expected point2  coordinates
   //Test #1        
        Point point2 = new Point(x2, y2); 
        if(point2.getX()==xx2 && point2.getY()==yy2) 
        {
            outputStream.printf("%-80s%-10s\n", "Point TEST SET 02: Test for constructor with parameters",  "PASSED");
            count++;
        }
        else  {
        	outputStream.printf("%-80s%-10s\n", "Point TEST SET 02: Test for constructor with parameters",  "FAILED");    	
        }

        double x1  = 125, y1 = 25; //  - original point coordinates
        double dx1 = 30, dy1 = -5; // - how the point moved
        double xx1 = 155, yy1 = 20; //- point after movement
        double rx1 = 20, ry1= -155; //- point after rotation

        Point point1 = new Point(); 
        point1.setX(x1);
        point1.setY(y1);
//Test #2          
        point1.move(dx1, dy1);
           
        if(point1.getX()==xx1 && point1.getY()==yy1) 
        {
            outputStream.printf("%-80s%-10s\n", "Point TEST SET 02: Test for move() method",  "PASSED");
            count++;
        }
        else {  outputStream.printf("%-80s%-10s\n", "Point TEST SET 02: Test for move() method",  "FAILED");
        
        }
 //Test #3       
        point1.rotate();

        if(point1.getX()==rx1 && point1.getY()==ry1) 
        {
            outputStream.printf("%-80s%-10s\n", "Point TEST SET 02: Test for rotate() method",  "PASSED");
            count++;
        }
        else  {
        	outputStream.printf("%-80s%-10s\n", "Point TEST SET 02: Test for rotate() method",  "FAILED");
        }

        if (count==expectedCount) return true;
        else return false;
    }
}
