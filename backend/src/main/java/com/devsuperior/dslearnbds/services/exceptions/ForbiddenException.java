package com.devsuperior.dslearnbds.services.exceptions;

public class ForbiddenException extends RuntimeException{
    private final long serialVersionUID = 1L;

    public ForbiddenException(String msg){
        super(msg);
    }
}
