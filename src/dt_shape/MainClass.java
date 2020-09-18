package dt_shape;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

//        Shape shape1 = new Shape();
//        System.out.println(shape1);
//        Shape shape2 = new Shape("green", true);
//        System.out.println(shape2);
//
//        System.out.println("");
//
//        Circle circle1 = new Circle();
//        System.out.println(circle1);
//        Circle circle2 = new Circle(7);
//        System.out.println(circle2);
//        System.out.println("Area: " + circle2.getArea());
//        System.out.println("Perimeter: " + circle2.getPerimeter());
//        
//        System.out.println();
//        
//        Rectangle rectangle1 = new Rectangle();
//        System.out.println(rectangle1);
//        Rectangle rectangle2 = new Rectangle(5, 3);
//        System.out.println(rectangle2);
//        System.out.println("Area: " + rectangle2.getArea());
//        System.out.println("Perimeter: " + rectangle2.getPerimeter());
//        
//        System.out.println();
//        
//        Square square1 = new Square();
//        System.out.println(square1);
//        Square square2 = new Square(3, "green", false);
//        System.out.println(square2);
//        System.out.println("Area: " + square2.getArea());
//        System.out.println("Perimeter: " + square2.getPerimeter());
        Scanner scanner = new Scanner(System.in);
        var command = "help";
        String chosenshape;
        String chosencolor;
        boolean chosenfilled;

        String radius = "1";
        String sides = "1";
        String width = "1";
        String length = "1";

        while (true) {
            switch (command) {
                default:
                    System.out.println("Unknown command.");
                    System.out.println("Type 'help' to list all commands.");
                    break;
                case "help":
                    System.out.println("new: Create a new shape.");
                    break;
                case "new":
                    //
                    //      SHAPE
                    //
                    while (true) {
                        System.out.println("Choose shape: rectangle, circle, square.");
                        System.out.print("Shape: ");
                        String shape = scanner.nextLine();
                        if (shape.equalsIgnoreCase("rectangle")) {
                            chosenshape = "rectangle";
                            break;
                        }
                        if (shape.equalsIgnoreCase("circle")) {
                            chosenshape = "circle";
                            break;
                        }
                        if (shape.equalsIgnoreCase("square")) {
                            chosenshape = "square";
                            break;
                        }

                        System.out.println("Please type in a valid shape.");
                    }
                    //
                    //      COLOR
                    //
                    while (true) {
                        System.out.println("Choose color: red, green, blue.");
                        System.out.print("Color: ");
                        String color = scanner.nextLine();
                        if (color.equalsIgnoreCase("red")) {
                            chosencolor = "red";
                            break;
                        } else if (color.equalsIgnoreCase("green")) {
                            chosencolor = "green";
                            break;
                        } else if (color.equalsIgnoreCase("blue")) {
                            chosencolor = "blue";
                            break;
                        }

                        System.out.println("Please type in a valid color.");
                    }
                    //
                    //      FILLED?
                    //
                    while (true) {
                        System.out.println("Is the shape filled? (y/n).");
                        System.out.print("Answer: ");
                        String color = scanner.nextLine();
                        if (color.equalsIgnoreCase("y")) {
                            chosenfilled = true;
                            break;
                        }
                        if (color.equalsIgnoreCase("n")) {
                            chosenfilled = false;
                            break;
                        }

                        System.out.println("Please be valid.");
                    }
                    //
                    //      (CIRCLE) RADIUS
                    //
                    if (chosenshape.equals("circle")) {
                        while (true) {
                            try {
                                System.out.println("Insert circle radius.");
                                System.out.print("Radius: ");
                                radius = scanner.nextLine();

                                Integer.parseInt(radius);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Not a number!");
                            }
                        }
                        //
                        //      (SQUARE) SIDES
                        //
                    } else if (chosenshape.equals("square")) {
                        while (true) {
                            try {
                                System.out.println("Insert square side length.");
                                System.out.print("Sides: ");
                                sides = scanner.nextLine();

                                Integer.parseInt(sides);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Not a number!");
                            }
                        }
                        //
                        //      (RECTANGLE) WIDTH LENGTH
                        //
                    } else if (chosenshape.equals("rectangle")) {
                        while (true) {
                            try {
                                System.out.println("Insert rectangle width.");
                                System.out.print("Width: ");
                                width = scanner.nextLine();

                                Integer.parseInt(width);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Not a number!");
                            }
                        }
                        while (true) {
                            try {
                                System.out.println("Insert rectangle length.");
                                System.out.print("Length: ");
                                length = scanner.nextLine();

                                Integer.parseInt(length);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Not a number!");
                            }
                        }
                    }

                    if (chosenshape.equals("circle")) {
                        
                        Circle circle = new Circle(Integer.parseInt(radius), chosencolor, chosenfilled);
                        
                        System.out.println("");
                        System.out.println("Shape: circle");
                        System.out.println("Color: " + circle.getColor());
                        System.out.println("Filled: " + circle.isFilled());
                        System.out.println("Radius: " + circle.getRadius());
                    } else if (chosenshape.equals("square")) {
                        Square square = new Square(Integer.parseInt(sides), chosencolor, chosenfilled);
                        
                        System.out.println("");
                        System.out.println("Shape: square");
                        System.out.println("Color: " + square.getColor());
                        System.out.println("Filled: " + square.isFilled());
                        System.out.println("Side: " + square.getSide());
                    } else if (chosenshape.equals("rectangle")) {
                        Rectangle rectangle = new Rectangle(Integer.parseInt(width), Integer.parseInt(length), chosencolor, chosenfilled);
                        
                        System.out.println("");
                        System.out.println("Shape: rectangle");
                        System.out.println("Color: " + rectangle.getColor());
                        System.out.println("Filled: " + rectangle.isFilled());
                        System.out.println("Width: " + rectangle.getWidth());
                        System.out.println("Length: " + rectangle.getLength());
                    }

                    break;
            }

            // resets chosenshape, chosencolor
            chosenshape = "";
            chosencolor = "";

            System.out.println("");
            System.out.print("Command: ");
            command = scanner.nextLine();
        }
    }

}
