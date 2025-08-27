package com.leonel.javabank.util;

import java.util.HashMap;
import java.util.Map;

public class ErrorCatalog {
    private static final Map<String, String> errorMessages = new HashMap<>();

    static {
        errorMessages
                .put("02658", """
                ERROR CODE: 02658
                Message: The account number doesn't match that of a Checking Account.
                Cause: Checking Accounts must start with '0' or '1'.
                Help: https://github.com/llimadev/java-bank-simulator/blob/main/README.md
                """);
        // Add more exceptions
    }
    public static String getMessage(String code) {
        return errorMessages.getOrDefault(code, "Unknown error code: " + code);
    }
}
