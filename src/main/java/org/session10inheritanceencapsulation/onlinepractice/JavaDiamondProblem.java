package org.session10inheritanceencapsulation.onlinepractice;

public class JavaDiamondProblem {

}

class Shape {

}

class Square extends Shape {

    void setArea() {
    }
}

class Rectangle extends Shape {

    void setArea() {

    }
}

//class Parallelogram extends Square, Rectangle {
//
//    public static void main(String[] args) {
//        Parallelogram parallelogram = new Parallelogram();
//        parallelogram.setArea();
//    }
//}