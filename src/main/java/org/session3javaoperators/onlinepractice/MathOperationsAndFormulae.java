package session_3;

public class MathOperationsAndFormulae {
    public static void main(String[] args) {

        rectangleArea();
        circleCircumference();
        arithmeticOperations();
        kilometersToMiles();

    }

        static void rectangleArea(){
            int length = 15;
            double width  = 4.5;

            var area = length * width;

            System.out.println("The rectangle area is : "+ area );
        }

        static void circleCircumference() {
            final double PI = Math.PI;
            double radius = 6.2;

            var circumference = PI * radius;
            System.out.format("The circle circumference of radius "+ radius+ " is " +circumference);
        }

        static void arithmeticOperations(){

        int firstNumber = 10;
        int secondNumber = 3;

        int division = firstNumber / secondNumber;

            System.out.println(division);

        }

        static void kilometersToMiles(){
            double kilometers = 3;
            double miles = kilometers /1.6;

            System.out.println(kilometers + " kilometers is equal to " + miles +" miles.");
        }
}
