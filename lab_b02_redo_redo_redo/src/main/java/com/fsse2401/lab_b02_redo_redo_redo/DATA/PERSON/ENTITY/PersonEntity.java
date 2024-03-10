package com.fsse2401.lab_b02_redo_redo_redo.DATA.PERSON.ENTITY;

import com.fsse2401.lab_b02_redo_redo_redo.DATA.PERSON.DOMAIN.CreatePersonRequestData;

public class PersonEntity {
    private String firstName;
    private String lastName;
    private String hkid;

    public PersonEntity(CreatePersonRequestData data) {
        this.firstName = data.getFirstName();
        this.lastName = data.getLastName();
        this.hkid = data.getHkid();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHkid() {
        return hkid;
    }

    public void setHkid(String hkid) {
        this.hkid = hkid;
    }
}
