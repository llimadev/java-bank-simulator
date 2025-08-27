package com.leonel.javabank.model;

public abstract class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    @Override
    public String toString() {

        if(accountNumber.startsWith("2")) {
            return "The Savings Account number: " + accountNumber +
                    ", has a balance of : " + balance;
        } else {
            return "The Checking Account number: " + accountNumber +
                    ", has a balance of : " + balance;
        }
    }
}
