package org.session10.homework.bankaccountmanagementsystem;

public class BankManagement {

    public static void main(String[] args) {
        BankAccount johnDoe = new BankAccount("John Doe");
        johnDoe.setBalance(100);
        johnDoe.getAccountDetails();

        johnDoe.deposit(15.0);
        johnDoe.getAccountDetails();
        johnDoe.deposit(-1.0);
        johnDoe.getAccountDetails();
        johnDoe.withdraw(20);
        johnDoe.getAccountDetails();

        System.out.println();
        BankAccount janeDoe = new BankAccount("Jane Doe");
        janeDoe.getAccountDetails();

        System.out.println();
        johnDoe.transferFunds(janeDoe, 50);
        janeDoe.getAccountDetails();
        johnDoe.getAccountDetails();
    }
}
