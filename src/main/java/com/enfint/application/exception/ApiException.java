package com.enfint.application.exception;

public class ApiException extends RuntimeException
{
    public ApiException(String message)
    {
        super(message);
    }
}
