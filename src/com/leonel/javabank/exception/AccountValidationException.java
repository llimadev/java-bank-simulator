package com.leonel.javabank.exception;

public class AccountValidationException extends IllegalArgumentException {
    private final String errorCode;

    public AccountValidationException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}