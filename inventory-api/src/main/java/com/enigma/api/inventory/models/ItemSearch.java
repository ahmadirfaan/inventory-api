package com.enigma.api.inventory.models;

import com.enigma.api.inventory.models.validations.Alphabetic;

public class ItemSearch extends PageSearch{

    @Alphabetic
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
