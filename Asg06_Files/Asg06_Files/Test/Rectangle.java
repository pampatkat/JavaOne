
/**
   Rectangle class
*/

public class Rectangle
{
   private double length;
   private double width;

   /**
      Constructor
      @param len The length of the rectangle.
      @param w The width of the rectangle.
      @throws IllegalArgumentException when length or width are negative or 0
   */

   public Rectangle(double len, double wid) throws IllegalArgumentException
   {
      if(len<=0) throw new IllegalArgumentException("Length must be non-negative: "+ len);
      if(wid<=0) throw new IllegalArgumentException("Width must be non-negative: "+ wid);
      length = len;
      width = wid;
   }
 
   /**
    * Non-argument constructor sets both fields to 1.0
    */
   public Rectangle()
   {
       length = 1;
       width = 1;
   }

   /**
      The setLength method stores a value in the
      length field.
      @param len The value to store in length.
      @throws IllegalArgumentException when length argument is negative or 0
   */

   public void setLength(double len)
   {
       if(len<=0) throw new IllegalArgumentException("Length must be non-negative: "+ len);
       length = len;
   }

   /**
      The setWidth method stores a value in the
      width field.
      @param w The value to store in width.
      @throws IllegalArgumentException when width argument is negative or 0
   */

   public void setWidth(double wid)
   {
      if(wid<=0) throw new IllegalArgumentException("Width must be non-negative: "+ wid);
      width = wid;
   }

   /**
      The getLength method returns a Rectangle
      object's length.
      @return The value in the length field.
   */

   public double getLength()
   {
      return length;
   }

   /**
      The getWidth method returns a Rectangle
      object's width.
      @return The value in the width field.
   */
   
   public double getWidth()
   {
      return width;
   }

   /**
      The getArea method returns a Rectangle
      object's area.
      @return The product of length times width.
   */

   public double getArea()
   {
      return length * width;
   }
   
   /**
    * Method compares two objects and returns true if their corresponding length and width fields are equal 
    * @param r object to compare with 
    * @return whether the objects are equal or not
    */
   public boolean equals(Rectangle r)
   {
	   return length==r.length && width==r.width;
   }
   
   /**
    * Method compares two Rectangle objects and returns true if the area of this object is smaller than the area of the one passed as parameter
    * @param r object to compare with
    * @return whether this object has a smaller area or not.
    */
   public boolean isLess(Rectangle r)
   {
	   return this.getArea() < r.getArea();
   }
 
   /**
    * Method compares two Rectangle objects and returns true if the area of this object is greater than the area of the one passed as parameter
    * @param r object to compare with
    * @return whether this object has a greater area or not.
    */
   public boolean isGreater(Rectangle r)
   {
	   return this.getArea() > r.getArea();
   }
}


