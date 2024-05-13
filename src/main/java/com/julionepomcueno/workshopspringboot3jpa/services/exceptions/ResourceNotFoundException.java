package com.julionepomcueno.workshopspringboot3jpa.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }
}
