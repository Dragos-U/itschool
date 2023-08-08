package session_3;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to input, sir/madam?");
        String userInput = scanner.nextLine();
        System.out.println("Do you really want to "+ userInput + "?");
        scanner.close();
    }
}
