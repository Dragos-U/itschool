package org.session4.onlinepractice;

public class JavaStatements {

    public static void main(String[] args) {
        int currentYear = 2023;
        int birthdayYear = 2000;
        int age = currentYear - birthdayYear;

        if (age >= 18) {
            System.out.println("This person can vote, because he is "+ age + " old");
        } else {
            System.out.println("This person cannot vote because he is a minor.");
        }

        int number = 143;
        if (number>0){
            System.out.println("positive number");
        } else if (number<0) {
            System.out.println("negative number");
        } else {
            System.out.println("Number is zero");
        }

        printName();
    }

    public static void printName(){
        String name = "Ioana";
        String city = "Cluj";
        String sex = "f";
        int age = 20;

        if (city.equals("Cluj")){
            if (sex.equals("f")){
                if(age == 20){
                    System.out.println(name);
                }
            }
        }

        if (city.equals("Cluj") && sex.equals("f") && age == 20){
            System.out.println(name);
        }
    }
}
