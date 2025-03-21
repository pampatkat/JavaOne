
/**
* @author Patcharee Catherina Jirakittiyakhon
*/


import java.io.PrintStream;
import java.util.ArrayList;

public class ArrayMethods {

    /**
     * Checks if an array of Rectangle objects is sorted in ascending order.
     * 
     * @param rectangles The array of Rectangle objects to check.
     * @return true if the array is sorted in ascending order, false otherwise.
     * @throws IllegalArgumentException if the array is empty.
     */
     public static boolean isSorted(Rectangle[] nums) 
     {
        if (nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i].isGreater(nums[i + 1])) {
                return false;
            }
        }
        return true;
     }
     /**
     * Checks if all elements in an array of integers are unique.
     * 
     * @param nums The array of integers to check.
     * @return true if all elements are unique, false otherwise.
     */
     public static boolean allUniqueElements(int[] nums)
     {
        if (nums.length == 0) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return false;
                }
            }
        }
        return true;
     }
    /**
     * Doubles the length and width of all square Rectangle objects in the array.
     * 
     * @param shapes The array of Rectangle objects to modify.
     */
     public static void doubleSquares(Rectangle[] shapes)
     {
        for (Rectangle shape : shapes) {
            if (shape.getLength() == shape.getWidth()) {
                shape.setLength(shape.getLength() * 2);
                shape.setWidth(shape.getWidth() * 2);
            }
        }    
     }
     /**
     * Removes all elements from the ArrayList that fall within the specified range [from, to].
     * 
     * @param a The ArrayList of integers to modify.
     * @param from The lower bound of the range (inclusive).
     * @param to The upper bound of the range (inclusive).
     * @throws IllegalArgumentException if "from" is greater than "to".
     */
     public static void removeInRange(ArrayList<Integer> a, int from, int to)
     {
        if (from > to) {
            throw new IllegalArgumentException("From value cannot be greater than to value.");
        }
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) >= from && a.get(i) <= to) {
                a.remove(i);
                i--; // Adjust index after removal
            }
        }
     }
     /**
     * Repeats each string in the ArrayList k times.
     * 
     * @param a The ArrayList of strings to modify.
     * @param k The number of times to repeat each string.
     * @throws IllegalArgumentException if k is negative or zero.
     */
     public static void repeat(ArrayList<String> a, int k)
     {
        if (k <= 0) {
            throw new IllegalArgumentException("k must be a positive integer.");
        }
        int originalSize = a.size();
        for (int i = 0; i < originalSize; i++) {
            String current = a.get(i * k);
            for (int j = 1; j < k; j++) {
                a.add(i * k + j, current);
            }
        }
     }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        PrintStream out = System.out;
        testIsSorted(out);
        testAllUniqueElements(out);
        testDoubleSquares(out);
        testRemoveInRange(out);
        testRepeat(out);
    }
    /**
     * Runs all tests for isSorted() method
     * @param outputStream - output stream, used to print into the screen
     * 
     */
    public static void testIsSorted(PrintStream outputStream)
    {
        Rectangle[] unsorted = {new Rectangle(), new Rectangle(2, 3), new Rectangle(), new Rectangle(5, 5), new Rectangle()};
        Rectangle[] sorted = {new Rectangle(1, 2), new Rectangle(2, 3), new Rectangle(4, 5), new Rectangle(5, 5), new Rectangle(6, 7)};
        Rectangle[] one = {new Rectangle(1, 2)};
        Rectangle[] empty = {};
        System.out.println("\r\n----Tests for isSorted() -------------------------------------------------------\r\n");
 // Test #1   
        if(isSorted(sorted)==true && isSorted(unsorted)==false && isSorted(one)==true)
        {
            outputStream.printf("%-80s%-10s\r\n", "isSorted() TEST 01 -- regular functionality",  "PASSED");
            
        }
        else outputStream.printf("%-80s%-10s\r\n", "isSorted() TEST 01 -- regular functionality",  "FAILED");
 
// Test #2        
         try{
             boolean ignoreMe = isSorted(empty);
             outputStream.printf("%-80s%-10s\r\n", "isSorted() TEST 02: IllegalArgumentException",  "FAILED");
         }
         catch(IllegalArgumentException e)
         {
            outputStream.printf("%-80s%-10s\r\n", "isSorted() TEST 02: IllegalArgumentException",  "PASSED");
                         
         }
                
    }

  /**
   * Runs all the tests for allUniqueElements() method
   * @param outputStream - output stream, used to print into the screen
   * 
   */  
    public static void testAllUniqueElements(PrintStream outputStream)
    {

        int[] a1 = {2, 16, 3, 5, 8, 12};
        int[] a2 = {1, 4, 9, 10, 9, 17};
        int[] a3 = {3};
        int[] empty = {};
        System.out.println("\r\n----Tests for allUniqueElements() -------------------------------------------------------\r\n");
 // Test #1 
        if(allUniqueElements(a1))
        {
            outputStream.printf("%-80s%-10s\r\n", "allUniqueElements() TEST 01 - all unque elements",  "PASSED");
           
        }
        else outputStream.printf("%-80s%-10s\r\n", "allUniqueElements() TEST 01 - all unque elements",  "FAILED");

// Test #2 
        if(allUniqueElements(a2)==false)
        {
            outputStream.printf("%-80s%-10s\r\n", "allUniqueElements() TEST 02 - not all unique",  "PASSED");
           
        }
        else outputStream.printf("%-80s%-10s\r\n", "allUniqueElements() TEST 02 - not all unique",  "FAILED");
 
// Test #3
        if(allUniqueElements(a3))
        {
            outputStream.printf("%-80s%-10s\r\n", "allUniqueElements() TEST 03 - array of 1 element",  "PASSED");
           
        }
        else outputStream.printf("%-80s%-10s\r\n", "allUniqueElements() TEST 03 - array of 1 element",  "FAILED");

// Test #4
        if(allUniqueElements(empty)==false)
        {
            outputStream.printf("%-80s%-10s\r\n", "allUniqueElements() TEST 04 - Empty array",  "PASSED");
            
        }
        else outputStream.printf("%-80s%-10s\r\n", "allUniqueElements() TEST 04 - Empty array",  "FAILED");

    }

    /**
     * Runs all the tests for doubleSquares() method
     * @param outputStream output stream, used to print into the screen 
     * 
     */
    public static void testDoubleSquares(PrintStream outputStream)
    {
      
        int size = 10;
        Rectangle[] shapes1 = new Rectangle[size];
        for(int i = 0; i<shapes1.length; i++)
        {
            if(i%3==0&& i!=0) shapes1[i] = new Rectangle(i+1, i+1); // building a square
            else shapes1[i] = new Rectangle(i+2, i+1); // building a regular rectangle
        }
        Rectangle[] shapes2 = new Rectangle[0];
        System.out.println("\r\n----Tests for doubleSquares() -------------------------------------------------------\r\n");
 // Test #1 
        doubleSquares(shapes1);
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
            
        }
        else outputStream.printf("%-80s%-10s\r\n", "doubleSquares() TEST 01 - regular array containing squares",  "FAILED");  
  // Test #2        
        doubleSquares(shapes2);
        if(shapes2.length==0)
        {
            outputStream.printf("%-80s%-10s\r\n", "doubleSquares() TEST 02 - Empty array",  "PASSED");
          
        }
        else outputStream.printf("%-80s%-10s\r\n", "doubleSquares() TEST 02 - Empty array",  "FAILED");  

    }
   /**
    * Runs all the tests for removeInRange() method
     * @param outputStream - output stream, used to print into the screen
    */ 
    public static void testRemoveInRange(PrintStream outputStream)
    {    

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
        System.out.println("\r\n----Tests for removeInRange() -------------------------------------------------------\r\n");
// Test #1
        removeInRange(listA, 0, 10);
        if(listA.equals(listTest01))
        {
            outputStream.printf("%-80s%-10s\r\n", "removeInRange() TEST 01 - removing several values",  "PASSED");
          
        }
        else outputStream.printf("%-80s%-10s\r\n", "removeInRange() TEST 01 - removing several values",  "FAILED");
// Test #2
        removeInRange(listB, -1, 100);
        if(listB.isEmpty())
        {
            outputStream.printf("%-80s%-10s\r\n", "removeInRange() TEST 02 - removing all values",  "PASSED");
           
        }
        else outputStream.printf("%-80s%-10s\r\n", "removeInRange() TEST 02 - removing all values",  "FAILED");    
// Test #3
        removeInRange(listB, -1, 100);
        if(listB.isEmpty())
        {
            outputStream.printf("%-80s%-10s\r\n", "removeInRange() TEST 03 - remove from empty list",  "PASSED");
            
        }
        else outputStream.printf("%-80s%-10s\r\n", "removeInRange() TEST 03 - remove from empty list",  "FAILED");    
 // Test #4
        removeInRange(listA, 25, 25);
        if(listA.equals(listTest04))
        {
            outputStream.printf("%-80s%-10s\r\n", "removeInRange() TEST 04 - range consists of 1 value [3,3]",  "PASSED");
            
        }
        else outputStream.printf("%-80s%-10s\r\n", "removeInRange() TEST 04 - range consists of 1 value [3,3]",  "FAILED");           
        
        try{
          removeInRange(listA, 2, 1);
          outputStream.printf("%-80s%-10s\r\n", "removeInRange() TEST 05 - IllegalArgumentException",  "FAILED");
        }
        catch(IllegalArgumentException e)
        {
           outputStream.printf("%-80s%-10s\r\n", "removeInRange() TEST 05 - IllegalArgumentException",  "PASSED");
                      
        }
 
    }
 /**
  * Runs all the tests for repeat() method
  * @param outputStream - output stream, used to print into the screen
  */   
    public static void testRepeat(PrintStream outputStream)
    {

        
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
        System.out.println("\r\n----Tests for repeat() -------------------------------------------------------------\r\n");
// Test #1
        repeat(listA, 3);
       
        if(listA.equals(listB))
        {
            outputStream.printf("%-80s%-10s\r\n", "repeat() TEST 01 - regular repeat",  "PASSED");
            
        }
        else outputStream.printf("%-80s%-10s\r\n", "repeat() TEST 01 - regular repeat",  "FAILED");
 
// Test #2
        repeat(listA, 1);
       
        if(listA.equals(listB))
        {
            outputStream.printf("%-80s%-10s\r\n", "repeat() TEST 02 - repeat(list, 1)",  "PASSED");
            
        }
        else outputStream.printf("%-80s%-10s\r\n", "repeat() TEST 02 - repeat(list, 1)",  "FAILED");
 // Test #3
        try{
           repeat(listA, 0); 
           outputStream.printf("%-80s%-10s\r\n", "repeat() TEST 03 - IllegalArgumentException",  "FAILED");
        }
        catch(IllegalArgumentException e)
        {
            outputStream.printf("%-80s%-10s\r\n", "repeat() TEST 03 - IllegalArgumentException",  "PASSED");
            
        }
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
    public static void printArray(int[] a)
    {
        if(a.length == 0) 
        { 
            System.out.println("[ ]");
            return;
        }  
         System.out.print("[");
         int i;
        for(i = 0; i<a.length-1; i++)
        {
            System.out.print(a[i]+", ");
        }
        System.out.print(a[i]+"]\n");
    }
    
    
}


