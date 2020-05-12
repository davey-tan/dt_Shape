package dt_shape;

public class Circle extends Shape {

    public double getRadius() {
        return circleRadius;
    }

    public void setRadius(double radius) {
        circleRadius = radius;
    }

    public double getArea() {
        return Math.PI * circleRadius * circleRadius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * circleRadius;
    }

    private double circleRadius;

    public Circle() {

    }

    public Circle(double radius) {
        circleRadius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        circleRadius = radius;
    }
}
