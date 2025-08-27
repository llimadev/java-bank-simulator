package com.leonel.javabank.app;

import com.leonel.javabank.exception.AccountValidationException;
import com.leonel.javabank.model.Account;
import com.leonel.javabank.model.CheckingAccount;
import com.leonel.javabank.util.ErrorLogger;

public class BankApp {
    public static void main(String[] args) {

        try {
            Account conta = new CheckingAccount("223456-0");
            System.out.println(conta);
        } catch (AccountValidationException e) {
            System.err.println("Ops! It looks like we ran into a problem " +
                    "while trying to create your account!" + e.getMessage());
            ErrorLogger.log(e);
        }
    }
}