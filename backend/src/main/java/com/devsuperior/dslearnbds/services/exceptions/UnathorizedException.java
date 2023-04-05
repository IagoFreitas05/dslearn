package com.devsuperior.dslearnbds.services.exceptions;

public class UnathorizedException extends RuntimeException{
    private final long serialVersionUID = 1L;

    public UnathorizedException(String message){
        super(message);
    }
}
