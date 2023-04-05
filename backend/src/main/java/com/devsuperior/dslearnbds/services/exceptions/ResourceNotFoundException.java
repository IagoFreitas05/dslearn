package com.devsuperior.dslearnbds.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    private final long serialVersionUID = 1L;

    public ResourceNotFoundException(String erroMessage){
        super(erroMessage);
    }
}
