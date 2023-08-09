package org.session4.homework;

public class Triangle {

//    Write a Java program that determines the type of a triangle based on its sides.
//    Declare three variables sideOne, sideTwo and sideThree to represent the sides of the triangle.
//    Use the ternary operator to determine and print whether the triangle is "Equilateral", "Isosceles", or "Scalene".

    public static String triangleType(int sideOne, int sideTwo, int sideThree){
        return (sideOne == sideTwo && sideTwo == sideThree) ? "Equilateral" :
                (sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree) ? "Isoscel" : "Scalene";
    }
}
