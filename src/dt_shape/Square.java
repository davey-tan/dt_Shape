package dt_shape;

public class Square extends Rectangle {

    public double getSide() {
        return squareSide;
    }

    public void setSide(double side) {
        squareSide = side;
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + ", side = " + squareSide + "]";
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }
    
    public void set(double side) {
        super.setWidth(side);
    }
    
    private double squareSide = 1;

    public Square() {

    }

    public Square(double side) {
        squareSide = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        squareSide = side;
    }
}