package com.cyprienotto.exceptions;

// Create Custom Exceptions : All exception name end with "Exception" suffix.

// if is checked -> extend the Exception class
// if is unchecked -> extend the Runtime exception class
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Insufficient funds in your account !");
    }
    public InsufficientFundsException(String message) {
        super(message);
    }

}
