package com.enigma.api.inventory.exceptions;

import org.springframework.http.HttpStatus;

public class EntityNotFoundException extends ApplicationException {

    public EntityNotFoundException() {
        super("error." + HttpStatus.NOT_FOUND.value() + ".entity", HttpStatus.NOT_FOUND);
    }

}
