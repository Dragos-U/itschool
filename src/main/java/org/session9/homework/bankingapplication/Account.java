package org.session9.homework.bankingapplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Account {

    private float balance;
    private List<String> transactions;

    public Account(float balance) {
        this.balance = balance;
        transactions = new ArrayList<>();
    }

    public void deposit(float amount) {
        balance += amount;
        System.out.println("$ "+amount+" deposited ");
        transactions.add("  >Deposit: $ "+amount);
        getTransactions();
    }

    public void withdraw(float amount) {
        balance -= amount;
        System.out.println("$ "+amount+" withdrawn ");
        transactions.add("  >Withdraw: $ "+amount);
        getTransactions();
    }

    public float getBalance() {
        System.out.println("Balance checked");
        transactions.add("  >Balance: $ "+balance);
        getTransactions();
        return balance;
    }

    public void getTransactions(){
        Collections.reverse(transactions);
        for (String transaction : transactions){
            System.out.println(transaction);
        }
        System.out.println();
    }
}
