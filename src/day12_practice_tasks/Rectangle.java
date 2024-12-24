package day12_practice_tasks;

public class Rectangle {
    // Attributes:
    private double width;
    private double length;

    // Ensure encapsulation for both fields.
// Conditions: The width and length cannot be set to negative or zero values.
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.err.println("The width cannot be set to negative or zero values.");
            System.exit(1);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            System.err.println("The length cannot be set to negative or zero values.");
            System.exit(1);
        }
        this.length = length;
    }

    //    Add a constructor that allows the user to set both fields during object creation.
    public Rectangle() {
        this.width = getWidth();
        this.length = getLength();
    }

//    Actions:


    //    calcArea(): Calculates and returns the area of the rectangle object.
    public double calcArea() {
        return width * length;
    }

    //    Calculates and returns the perimeter of the rectangle object.
    public double calcPerimeter() {
        return (getLength() + getWidth()) * 2;
    }

    //    toString(): Displays the width,length,area, and perimeter of the rectangle when the object is printed.
    public String toString() {
        return "Width = " + width + " Length = " + length + " Area = " + calcArea() + " Perimeter = " + calcPerimeter();
    }

}