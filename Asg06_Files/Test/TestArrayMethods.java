import java.io.PrintWriter;
import java.util.ArrayList;

public class TestArrayMethods {

	   /**
     * Runs all tests for isSorted() method
     * @param outputStream - output stream, used to print into the screen
     * 
     */
    public static boolean testIsSorted(PrintWriter outputStream)
    {
        int count = 0;
        int expectedCount = 2;
        
        Rectangle[] unsorted = {new Rectangle(), new Rectangle(2, 3), new Rectangle(), new Rectangle(5, 5), new Rectangle()};
        Rectangle[] sorted = {new Rectangle(1, 2), new Rectangle(2, 3), new Rectangle(4, 5), new Rectangle(5, 5), new Rectangle(6, 7)};
        Rectangle[] one = {new Rectangle(1, 2)};
        Rectangle[] empty = {};
        outputStream.println("\r\n----Tests for isSorted() -------------------------------------------------------\r\n");
 // Test #1   
        if(ArrayMethods.isSorted(sorted)==true && ArrayMethods.isSorted(unsorted)==false && ArrayMethods.isSorted(one)==true)
        {
            outputStream.printf("%-80s%-10s\r\n", "isSorted() TEST 01 -- regular functionality",  "PASSED");
            count++;         
        }
        else outputStream.printf("%-80s%-10s\r\n", "isSorted() TEST 01 -- regular functionality",  "FAILED");
 
// Test #2        
         try{
             boolean ignoreMe = ArrayMethods.isSorted(empty);
             outputStream.printf("%-80s%-10s\r\n", "isSorted() TEST 02: IllegalArgumentException",  "FAILED");
         }
         catch(IllegalArgumentException e)
         {
            outputStream.printf("%-80s%-10s\r\n", "isSorted() TEST 02: IllegalArgumentException",  "PASSED");
            count++;            
         }

         if (count==expectedCount) return true;
         else return false;
    }

  /**
   * Runs all the tests for allUniqueElements() method
   * @param outputStream - output stream, used to print into the screen
   * 
   */  
    public static boolean testAllUniqueElements(PrintWriter outputStream)
    {

        int count = 0;
        int expectedCount = 4;
        
        int[] a1 = {2, 16, 3, 5, 8, 12};
        int[] a2 = {1, 4, 9, 10, 9, 17};
        int[] a3 = {3};
        int[] empty = {};
        outputStream.println("\r\n----Tests for allUniqueElements() -------------------------------------------------------\r\n");
 // Test #1 
        if(ArrayMethods.allUniqueElements(a1))
        {
            outputStream.printf("%-80s%-10s\r\n", "allUniqueElements() TEST 01 - all unque elements",  "PASSED");
            count++;
        }
        else outputStream.printf("%-80s%-10s\r\n", "allUniqueElements() TEST 01 - all unque elements",  "FAILED");

// Test #2 
        if(ArrayMethods.allUniqueElements(a2)==false)
        {
            outputStream.printf("%-80s%-10s\r\n", "allUniqueElements() TEST 02 - not all unique",  "PASSED");
            count++;
        }
        else outputStream.printf("%-80s%-10s\r\n", "allUniqueElements() TEST 02 - not all unique",  "FAILED");
 
// Test #3
        if(ArrayMethods.allUniqueElements(a3))
        {
            outputStream.printf("%-80s%-10s\r\n", "allUniqueElements() TEST 03 - array of 1 element",  "PASSED");
            count++;
        }
        else outputStream.printf("%-80s%-10s\r\n", "allUniqueElements() TEST 03 - array of 1 element",  "FAILED");

// Test #4
        if(ArrayMethods.allUniqueElements(empty)==false)
        {
            outputStream.printf("%-80s%-10s\r\n", "allUniqueElements() TEST 04 - Empty array",  "PASSED");
            count++;
        }
        else outputStream.printf("%-80s%-10s\r\n", "allUniqueElements() TEST 04 - Empty array",  "FAILED");

        if (count==expectedCount) return true;
        else return false;
    }

    /**
     * Runs all the tests for doubleSquares() method
     * @param outputStream output stream, used to print into the screen 
     * 
     */
    public static boolean testDoubleSquares(PrintWriter outputStream)
    {

        int count = 0;
        int expectedCount = 2;
        
        int size = 10;
        Rectangle[] shapes1 = new Rectangle[size];
        for(int i = 0; i<shapes1.length; i++)
        {
            if(i%3==0&& i!=0) shapes1[i] = new Rectangle(i+1, i+1); // building a square
            else shapes1[i] = new Rectangle(i+2, i+1); // building a regular rectangle
        }
        Rectangle[] shapes2 = new Rectangle[0];
        outputStream.println("\r\n----Tests for doubleSquares() -------------------------------------------------------\r\n");
 // Test #1 
        ArrayMethods.doubleSquares(shapes1);
        boolean passed = true;
        for(int i = 0; (i<shapes1.length) && passed; i++)
        {
            if(i%3==0 && i!=0) 
            {
                if(shapes1[i].getLength()!=(i+1)*2 || shapes1[i].getWidth()!=(i+1)*2)
                {
                    passed = false;
                }
            }
            else 
            {
                if(shapes1[i].getLength()!=i+2 || shapes1[i].getWidth()!=i+1)
                {
                    passed = false;
                }
            }
        }        
        if(passed)
        {
            outputStream.printf("%-80s%-10s\r\n", "doubleSquares() TEST 01 - regular array containing squares",  "PASSED");
            count++;
        }
        else outputStream.printf("%-80s%-10s\r\n", "doubleSquares() TEST 01 - regular array containing squares",  "FAILED");  
  // Test #2        
        ArrayMethods.doubleSquares(shapes2);
        if(shapes2.length==0)
        {
            outputStream.printf("%-80s%-10s\r\n", "doubleSquares() TEST 02 - Empty array",  "PASSED");
            count++;
        }
        else outputStream.printf("%-80s%-10s\r\n", "doubleSquares() TEST 02 - Empty array",  "FAILED");  

        if (count==expectedCount) return true;
        else return false;
    }
   /**
    * Runs all the tests for removeInRange() method
     * @param outputStream - output stream, used to print into the screen
    */ 
    public static boolean testRemoveInRange(PrintWriter outputStream)
    {    

        int count = 0;
        int expectedCount = 5;
        
        int[] tmp = {8, 6, 1, 4, 25, 1, 3, 7, 6, 8, 77, 3, 16};
        int[] test01 = {25, 77, 16};
        ArrayList<Integer> listA = new ArrayList();
        ArrayList<Integer> listB = new ArrayList();
        ArrayList<Integer> listTest01 = new ArrayList();
        ArrayList<Integer> listTest04 = new ArrayList();
        for(int i = 0; i<tmp.length; i++)
        {
           listA.add(tmp[i]);
           listB.add(tmp[i]);
        }
        for(int i = 0; i<test01.length; i++)
        {
            listTest01.add(test01[i]);
            listTest04.add(test01[i]);
        }
        listTest04.remove(0);
        outputStream.println("\r\n----Tests for removeInRange() -------------------------------------------------------\r\n");
// Test #1
        ArrayMethods.removeInRange(listA, 0, 10);
        if(listA.equals(listTest01))
        {
            outputStream.printf("%-80s%-10s\r\n", "removeInRange() TEST 01 - removing several values",  "PASSED");
            count++;
        }
        else outputStream.printf("%-80s%-10s\r\n", "removeInRange() TEST 01 - removing several values",  "FAILED");
// Test #2
        ArrayMethods.removeInRange(listB, -1, 100);
        if(listB.isEmpty())
        {
            outputStream.printf("%-80s%-10s\r\n", "removeInRange() TEST 02 - removing all values",  "PASSED");
            count++;
        }
        else outputStream.printf("%-80s%-10s\r\n", "removeInRange() TEST 02 - removing all values",  "FAILED");    
// Test #3
        ArrayMethods.removeInRange(listB, -1, 100);
        if(listB.isEmpty())
        {
            outputStream.printf("%-80s%-10s\r\n", "removeInRange() TEST 03 - remove from empty list",  "PASSED");
            count++;
        }
        else outputStream.printf("%-80s%-10s\r\n", "removeInRange() TEST 03 - remove from empty list",  "FAILED");    
 // Test #4
        ArrayMethods.removeInRange(listA, 25, 25);
        if(listA.equals(listTest04))
        {
            outputStream.printf("%-80s%-10s\r\n", "removeInRange() TEST 04 - range consists of 1 value [3,3]",  "PASSED");
            count++;
        }
        else outputStream.printf("%-80s%-10s\r\n", "removeInRange() TEST 04 - range consists of 1 value [3,3]",  "FAILED");           
        
        // Test #5
        try{
          ArrayMethods.removeInRange(listA, 2, 1);
          outputStream.printf("%-80s%-10s\r\n", "removeInRange() TEST 05 - IllegalArgumentException",  "FAILED");
        }
        catch(IllegalArgumentException e)
        {
           outputStream.printf("%-80s%-10s\r\n", "removeInRange() TEST 05 - IllegalArgumentException",  "PASSED");
           count++;           
        }
        if (count==expectedCount) return true;
        else return false; 
    }
 /**
  * Runs all the tests for repeat() method
  * @param outputStream - output stream, used to print into the screen
  */   
    public static boolean testRepeat(PrintWriter outputStream)
    {

        int count = 0;
        int expectedCount = 3;
        
        ArrayList<String>listA = new ArrayList();
        listA.add("aa");
        listA.add("bb");
        listA.add("cc");
     
        ArrayList<String>listB = new ArrayList();
        String[] tmp = {"aa", "aa", "aa", "bb", "bb", "bb", "cc", "cc", "cc"};
        for(int i = 0; i<tmp.length; i++)
        {
            listB.add(tmp[i]);
        }
        outputStream.println("\r\n----Tests for repeat() -------------------------------------------------------------\r\n");
// Test #1
        ArrayMethods.repeat(listA, 3);
       
        if(listA.equals(listB))
        {
            outputStream.printf("%-80s%-10s\r\n", "repeat() TEST 01 - regular repeat",  "PASSED");
            count++;
        }
        else outputStream.printf("%-80s%-10s\r\n", "repeat() TEST 01 - regular repeat",  "FAILED");
 
// Test #2
        ArrayMethods.repeat(listA, 1);
       
        if(listA.equals(listB))
        {
            outputStream.printf("%-80s%-10s\r\n", "repeat() TEST 02 - repeat(list, 1)",  "PASSED");
            count++;
        }
        else outputStream.printf("%-80s%-10s\r\n", "repeat() TEST 02 - repeat(list, 1)",  "FAILED");
 // Test #3
        try{
           ArrayMethods.repeat(listA, 0); 
           outputStream.printf("%-80s%-10s\r\n", "repeat() TEST 03 - IllegalArgumentException",  "FAILED");
        }
        catch(IllegalArgumentException e)
        {
            outputStream.printf("%-80s%-10s\r\n", "repeat() TEST 03 - IllegalArgumentException",  "PASSED");
            count++;
        }
        
        if (count==expectedCount) return true;
        else return false; 
    }
            
/**
 * Compares two arrays of integers
 * @param one first array to compare
 * @param two second array to compare
 * @return returns true if arrays are the same, false if not
 */    
    public static boolean equal(int[] one, int[] two)
    {
        if(one.length!=two.length) return false;
        for(int i= 0; i<one.length; i++)  
        {
            if(one[i]!=two[i]) return false;
        }
        return true;
    }
 /**
  * Outputs into the screen an array of integers
  * @param a an array to print out
  */
    public static void printArray(int[] a, PrintWriter outputStream)
    {
        if(a.length == 0) 
        { 
            outputStream.println("[ ]");
            return;
        }  
         outputStream.print("[");
         int i;
        for(i = 0; i<a.length-1; i++)
        {
            outputStream.print(a[i]+", ");
        }
        outputStream.print(a[i]+"]\n");
    }
}
