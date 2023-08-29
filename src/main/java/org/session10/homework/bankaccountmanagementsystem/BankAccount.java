package org.session10.homework.bankaccountmanagementsystem;

import java.util.UUID;

public class BankAccount {

    private String accountHolderName;
    private final UUID accountNumber;
    private double balance;

    public BankAccount(String accountHolderName) {
        this();
        this.accountHolderName = accountHolderName;
    }

    public BankAccount() {
        accountNumber = UUID.randomUUID();
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public UUID getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Negative deposit is not allowed.");
        } else {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Negative withdraw is not allowed.");
        } else {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Not enough founds");
            }
        }
    }

    public void getAccountDetails() {
        System.out.println("Account holder > " +
                accountHolderName + " | Balance > $ " +
                balance + " | Account number > " +
                accountNumber);
    }

    public void transferFunds(BankAccount targetAccount, double amount) {
        if (targetAccount.getAccountNumber() != accountNumber && balance >= amount) {
            targetAccount.setBalance(amount);
            balance -= amount;
        } else {
            System.out.println("Wrong account or insufficient founds.");
        }
    }
}