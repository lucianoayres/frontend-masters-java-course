package inherintance;

import objects.Rectangle;

public class InheritanceTester {
    public static void main(String[] args) {
        // Person person = new Person();
        // Employee employee = new Employee();
        Square square = new Square();
        square.setLength(25);

        Rectangle rectangle = new Rectangle();
        rectangle.print();

        square.print("square");

        //System.out.println(square.calculatePerimeter());
    }
}
