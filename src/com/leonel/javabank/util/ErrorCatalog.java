package com.leonel.javabank.util;

import java.util.HashMap;
import java.util.Map;

public class ErrorCatalog {
    private static final Map<String, String> errorMessages = new HashMap<>();

    static {

        // Account Exceptions
        errorMessages
                .put("10001", """
                ERROR CODE: 02658
                Message: The account number doesn't match that of a Checking Account.
                Cause: Checking Accounts must start with '0' or '1'.
                Help: https://github.com/llimadev/java-bank-simulator/blob/main/README.md
                """);

        errorMessages
                .put("10002", """
                ERROR CODE: 01153
                Message: The account number doesn't match that of a Savings Account.
                Cause: Savings Account must start with '2'
                Help: https://github.com/llimadev/java-bank-simulator/blob/main/README.md
                """);

        // Transaction Exceptions
        errorMessages
                .put("20001", """
                ERROR CODE: 20001
                Message: No deposit was made.
                Cause: There was an attempt to deposit a negative amount.
                Help: https://github.com/llimadev/java-bank-simulator/blob/main/README.md
                """);
        // Add more exceptions
    }
    public static String getMessage(String code) {
        return errorMessages.getOrDefault(code, "Unknown error code: " + code);
    }
}
