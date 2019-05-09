package com.codegym.squareResizeable;

import com.codegym.rectangleResizeable.Rectangle;

public class Square extends Rectangle implements ResizeableSquare  {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
      return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
    }


    @Override
    public String toString() {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resizeSquare(double percent) {
        setSide(getSide() * (1 + percent/100));
    }
}
