package com.dgs.springbootpetclinic.model;

public class Speciality extends BaseEntity {

    private String description;

    public String getDescirption() {
        return description;
    }

    public void setDescirption(String description) {
        this.description = description;
    }
}
