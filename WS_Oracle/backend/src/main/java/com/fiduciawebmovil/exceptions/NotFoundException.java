package com.fiduciawebmovil.exceptions;

public class NotFoundException  extends RuntimeException{
    public NotFoundException(String error){
        super(error);
    }
}
