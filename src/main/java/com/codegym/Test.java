package com.codegym;

import com.codegym.circleResizeable.Circle;
import com.codegym.rectangleResizeable.Rectangle;
import com.codegym.squareResizeable.Square;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4.5);
        shapes[1] = new Square(7);
        shapes[2] = new Rectangle(2.5, 3);
        System.out.println("before resized: ");
        for (Shape shape:shapes)
            System.out.println(shape);
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                ((Circle) shape).resizeCircle(50);
            }
          else if (shape instanceof Square) {
                ((Square) shape).resizeSquare(200);
            }
           else if (shape instanceof Rectangle) {
                ((Rectangle) shape).resizeRectangle(200);
            }

        }
        System.out.println("after resized: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

}
