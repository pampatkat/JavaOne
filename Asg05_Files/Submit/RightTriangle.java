
/**
* @author Patcharee Catherina Jirakittiyakhon
*/


public class RightTriangle {
    private double legA;
    private double legB;

     // No-argument constructor
     public RightTriangle() {
        this.legA = 1;
        this.legB = 1;
    }

    // Constructor with parameters
    public RightTriangle(double legA, double legB) {
        if (legA <= 0 || legB <= 0) {
            throw new IllegalArgumentException("Legs must be positive numbers.");
        }
        this.legA = legA;
        this.legB = legB;
    }

    // Mutator methods
    public void setLegA(double legA) {
        if (legA <= 0) {
            throw new IllegalArgumentException("LegA must be a positive number.");
        }
        this.legA = legA;
    }

    public void setLegB(double legB) {
        if (legB <= 0) {
            throw new IllegalArgumentException("LegB must be a positive number.");
        }
        this.legB = legB;
    }

    // Accessor methods
    public double getLegA() {
        return legA;
    }

    public double getLegB() {
        return legB;
    }

    // Method to calculate hypotenuse
    public double getHypotenuse() {
        return Math.sqrt((legA * legA) + (legB * legB));
    }

    // Method to calculate area
    public double getArea() {
        return (legA * legB) / 2;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return legA + legB + getHypotenuse();
    }

    // toString method
    @Override
    public String toString() {
        return "legA = " + legA + ", legB = " + legB;
    }
}
