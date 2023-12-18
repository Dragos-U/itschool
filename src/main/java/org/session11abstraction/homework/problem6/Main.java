package org.session11abstraction.homework.problem6;

public class Main {

    public static void main(String[] args) {
        Area area = new Area();

        System.out.println("Square area > " + area.squareArea(4.5));
        System.out.println("Circle area > " + area.circleArea(6));
        System.out.println("Rectangle area > " + area.rectangleArea(2, 3));
    }
}
