package com.techelevator.exceptions;

public class InvalidHotelArgumentException extends IllegalArgumentException {
    public InvalidHotelArgumentException(String message) {
        super("Invalid number raised. " + message);
    }
}
