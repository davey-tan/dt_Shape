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
    }

}
