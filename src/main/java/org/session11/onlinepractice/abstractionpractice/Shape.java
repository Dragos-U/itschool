package org.session11.onlinepractice.abstractionpractice;

public abstract class Shape {

    abstract double area() ;

    abstract double perimeter();
}

class Circle extends Shape{

    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI*radius*radius;
    }

    @Override
    double perimeter() {
        return Math.PI*radius*2;
    }
}

class Rectangle extends Shape{

    private double length, width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length*width;
    }

    @Override
    double perimeter() {
        return 2*(length+width);
    }
}
