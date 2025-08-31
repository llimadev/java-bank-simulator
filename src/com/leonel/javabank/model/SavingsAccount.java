package com.leonel.javabank.model;

import com.leonel.javabank.exception.AccountValidationException;
import com.leonel.javabank.exception.TransactionValidationException;
import com.leonel.javabank.util.ErrorCatalog;

public class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber) {
        super(accountNumber);
        if (!accountNumber.startsWith("2")) {
            throw new AccountValidationException("01153",
                    ErrorCatalog.getMessage("01153"));
        }
    }
    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new TransactionValidationException("20001",
                    ErrorCatalog.getMessage("20001"));
        }
        balance += amount;
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new TransactionValidationException("20002",
                    ErrorCatalog.getMessage("20002"));
        }
        if (amount > balance) {
            throw new TransactionValidationException("20003",
                    ErrorCatalog.getMessage("20003"));
        }
        balance -= amount;
    }
}
