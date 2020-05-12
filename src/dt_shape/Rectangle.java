package dt_shape;

public class Rectangle extends Shape {

    public double getWidth() {
        return rectangleWidth;
    }

    public void setWidth(double width) {
        rectangleWidth = width;
    }

    public double getLength() {
        return rectangleLength;
    }

    public void setLength(double length) {
        rectangleLength = length;
    }

    public double getArea() {
        return rectangleWidth * rectangleLength;
    }

    public double getPerimeter() {
        return 2 * (rectangleWidth + rectangleLength);
    }

    public String toString() {
        return "Rectangle[" + super.toString() + ", width = " + rectangleWidth + ", length = " + rectangleLength + "]";
    }

    private double rectangleWidth = 1;
    private double rectangleLength = 1;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        rectangleWidth = width;
        rectangleLength = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        rectangleWidth = width;
        rectangleLength = length;
    }
}
