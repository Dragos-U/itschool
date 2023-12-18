package org.session11abstraction.homework.problem6;

public class Area extends Shape {

    @Override
    double rectangleArea(double width, double length) {
        return width * length;
    }

    @Override
    double squareArea(double side) {
        return side * side;
    }

    @Override
    double circleArea(double radius) {
        return Math.PI * 2 * radius;
    }
}
