package com.leonel.javabank.model;

import com.leonel.javabank.exception.AccountValidationException;
import com.leonel.javabank.util.ErrorCatalog;

public class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber) {
        super(accountNumber);
        if (!accountNumber.startsWith("2")) {
            throw new AccountValidationException("01153",
                    ErrorCatalog.getMessage("01153"));
        }
    }
}
