package com.devsuperior.dslearnbds.services.exceptions;

public class ResourceDatabaseIntegrityException extends RuntimeException{
    private final long serialVersionUID = 1L;

    public ResourceDatabaseIntegrityException(String erroMessage){
        super(erroMessage);
    }
}
