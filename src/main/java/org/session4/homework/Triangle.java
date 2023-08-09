package org.session4.homework;

public class Triangle {

    public static String triangleType(int sideOne, int sideTwo, int sideThree){
        return (sideOne == sideTwo && sideTwo == sideThree) ? "Equilateral" :
                (sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree) ? "Isoscel" : "Scalene";
    }
}
