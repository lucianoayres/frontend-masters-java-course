package abstraction;

import org.w3c.dom.css.Rect;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double calculateArea() {
        return width * length;
    }
}
