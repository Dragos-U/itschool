package session_3.homework;

import java.util.Scanner;

public class CalculateDiscount {

    private double originalPrice;
    private double discount;

    public void requestUserInput(){
        System.out.println("We shall apply a discount to a given price.");
        System.out.println("Please input the original price followed by space and the discount followed by space");
        System.out.println(" Example: 24  19%");
        System.out.println("======================");
        System.out.println("Waiting for input ....");
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(" ");
        this.originalPrice = scanner.nextDouble();
        String temp = scanner.next();
        this.discount = Double.parseDouble(temp.substring(0,temp.length()-1));
    }

    public void calculateDiscountAndDisplay(){
        displayDiscountCalculation(originalPrice, discount);
    }

    private void displayDiscountCalculation(double originalPrice, double discount){
        System.out.println("The discounted price is : " + originalPrice*(1-discount/100)+"\n");
    }

}
