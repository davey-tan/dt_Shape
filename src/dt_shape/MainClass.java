package dt_shape;

public class MainClass {

    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1);
        Shape shape2 = new Shape("green", true);
        System.out.println(shape2);

        System.out.println("");

        Circle circle1 = new Circle();
        System.out.println(circle1);
        Circle circle2 = new Circle(7);
        System.out.println(circle2);
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());
        
        System.out.println();
        
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(5, 3);
        System.out.println(rectangle2);
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
        
        System.out.println();
        
        Square square1 = new Square();
        System.out.println(square1);
        Square square2 = new Square(3, "green", false);
        System.out.println(square2);
        System.out.println("Area: " + square2.getArea());
        System.out.println("Perimeter: " + square2.getPerimeter());
    }

}
