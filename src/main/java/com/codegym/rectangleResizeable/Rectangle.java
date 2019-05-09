package com.codegym.rectangleResizeable;

import com.codegym.Shape;

public class Rectangle extends Shape implements ResizeableRectangle {
    private double width = 1;
    private double length = 1;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled,
                     double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
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

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width= " + getWidth() + " length = " + getLength()
                + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resizeRectangle(double percent) {
        width += width * (percent/100);
        length += length * (percent/100);
    }
}
