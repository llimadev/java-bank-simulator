package com.leonel.javabank.model;

import com.leonel.javabank.exception.AccountValidationException;
import com.leonel.javabank.exception.TransactionValidationException;
import com.leonel.javabank.util.ErrorCatalog;

public class CheckingAccount extends Account {
    public CheckingAccount(String accountNumber) {
        super(accountNumber);
        if(!(accountNumber.startsWith("0") || accountNumber.startsWith("1"))) {
            throw new AccountValidationException("02658",
                    ErrorCatalog.getMessage("02658"));
        }
    }
}