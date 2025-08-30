package com.leonel.javabank.exception;

public class TransactionValidationException extends IllegalArgumentException {
    private final String errorCode;

    public TransactionValidationException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public static String defaultValidationMessage() {
        return "Ops! It looks like we ran into a problema while trying to create your account.\n";
    }
}
