/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vanham_ch13_recursionandadvancedalgorithms;

/**
 * Circle class.
 */
public class Circle implements Comparable{

    private static final double PI = 3.14;
    private double radius;

    /**
     * constructor
     * pre: none
     * post: A Circle object created. Radius initialized to 1.
     */
    public Circle() {
        radius = 1; //default radius
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Changes the radius of the circle.
     * pre: none
     * post: Radius has been changed.
     */
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    /**
     * Calculates the area of the circle.
     * pre: none
     * post: The area of the circle has been returned.
     */
    public double area() {
        double circleArea;
        circleArea = PI * radius * radius;
        return (circleArea);
    }

    /**
     * Returns the radius of the circle.
     * pre: none
     * post: The radius of the circle has been returned.
     */
    public double getRadius() {
        return (radius);
    }

    public double circumference() {
        return (2 * PI * radius);
    }

    /**
     * Displays the formula for the area of a circle.
     * pre: none
     * post: The formula for area of a circle has been displayed.
     */
    public static void displayAreaFormula() {
        System.out.println("The formula for the area of a circle is a = Pi * r * r");
    }

    /**
     * Determines if the object is equal to another Circle object.
     * pre: c is a Circle object.
     * post: true has been returned if the objects have the same
     * radii. false has been returned otherwise.
     */
    public boolean equals(Object c) {
        Circle testObj = (Circle) c;
        if (testObj.getRadius() == radius) {
            return (true);
        } else {
            return (false);
        }
    }

    /**
     * Returns a String that represents the Circle object.
     * pre: none
     * post: A string representing the Circle object has been returned.
     */
    public String toString() {
        String circleString;
        circleString = "Circle has radius " + radius;
        return (circleString);
    }

    @Override
    public int compareTo(Object o) {
        Circle testObj = (Circle)o;
        if (radius > testObj.getRadius()) {
            return 1;
        } else if (radius < testObj.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }
}
