/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dt_shape;

/**
 *
 * @author Crestfall
 */
public class Shape {

    public String getColor() {
        return shapeColor;
    }

    public void setColor(String color) {
        shapeColor = color;
    }

    public boolean isFilled() {
        return shapeFilled;
    }

    public void setFilled(boolean filled) {
        shapeFilled = filled;
    }

    private String shapeColor = "red";
    private boolean shapeFilled = true;

    public Shape() {

    }
    
    public Shape(String color, boolean filled) {
        shapeColor = color;
        shapeFilled = filled;
    }
}
