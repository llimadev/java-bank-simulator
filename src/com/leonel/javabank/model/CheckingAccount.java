package com.leonel.javabank.model;

import com.leonel.javabank.exception.AccountValidationException;
import com.leonel.javabank.util.ErrorCatalog;

public class CheckingAccount extends Account {
    public CheckingAccount(String accountNumber) {
        super(accountNumber);
        if(accountNumber.startsWith("2")){
            throw new AccountValidationException("02658",
                    ErrorCatalog.getMessage("02658"));
        }
    }
}