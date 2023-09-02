package org.session11.homework.problem3;

public class Main {

    public static void main(String[] args) {
        StudentA studentA = new StudentA(54,76,90);
        StudentB studentB = new StudentB(45,98,73,81);

        System.out.println(studentA.getPercentage());
        System.out.println(studentB.getPercentage());
    }
}
