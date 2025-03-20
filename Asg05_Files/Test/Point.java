
/**
* @author Patcharee Catherina Jirakittiyakhon
*/


public class Point {
    private double x;
    private double y;

    //Constructor no-argument constructor that sets the point coordinates to (1, 1),
    public Point(){
        this.x = 1;
        this.y = 1;
    }
    //Constructor a constructor that takes x and y coordinate of the point and sets class fields
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    //two accessor methods to retrieve the coordinates of the point called getX() and getY()
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    //Methods setX() and setY() that set the private data fields .
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    //A method to move the point by an amount along the vertical and horizontal directions specified by the first and second arguments: move(double dx, double dy)
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }
    //The method to rotate the point by 90 degrees clockwise around the origin called rotate(). Method does not take parameters and does not return any values
    public void rotate() {
        double tempX = this.y;
        double tempY = -this.x;
        this.x = tempX;
        this.y = tempY;
    }
}
