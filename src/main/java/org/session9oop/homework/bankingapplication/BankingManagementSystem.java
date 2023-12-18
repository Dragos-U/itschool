package org.session9oop.homework.bankingapplication;

public class BankingManagementSystem {

    public static void main(String[] args) {
        AccountHolder accountHolder = new AccountHolder("John Doe");
        Account account = new Account(0);
        accountHolder.setAccount(account);

        account.deposit(20);
        account.withdraw(5.4f);
        account.getBalance();

    }
}
