package org.session9oop.homework.bankingapplication;

public class AccountHolder {

    private String name;
    private String address;
    private Account account;

    public AccountHolder(String name){
        this.name = name;
    }

    public void setAccount(Account account){
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return  "Name ='" + name + '\'' +
                ", balance = $ " + account.getBalance();
    }
}
