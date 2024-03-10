package com.fsse2401.lab_b02_redo_redo_redo.DATA.PERSON.DOMAIN;

import com.fsse2401.lab_b02_redo_redo_redo.DATA.PERSON.ENTITY.PersonEntity;

public class CreatePersonResponseData {

    private String firstName;
    private String lastName;
    private String hkid;

    public CreatePersonResponseData(PersonEntity personEntity) {
        this.firstName = personEntity.getFirstName();
        this.lastName = personEntity.getLastName();
        this.hkid = personEntity.getHkid();
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
