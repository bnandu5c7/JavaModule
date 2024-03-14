package com.kpit;

public class FlightNumberNotFoundException extends RuntimeException {
    public FlightNumberNotFoundException(String msg)
    {
        super(msg);
    }
    
}
