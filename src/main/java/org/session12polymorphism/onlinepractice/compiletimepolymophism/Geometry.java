package org.session12polymorphism.onlinepractice.compiletimepolymophism;

public class Geometry {

    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public double area(double base, double height) {
        return base * height / 2;
    }
}
