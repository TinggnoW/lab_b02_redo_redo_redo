package com.fsse2401.lab_b02_redo_redo_redo.DATA.PERSON.DOMAIN;

import com.fsse2401.lab_b02_redo_redo_redo.DATA.PERSON.ENTITY.PersonEntity;

public class GetAllPeopleResponseData {
    private String firstName;
    private String lastName;
    private String hkid;

    public GetAllPeopleResponseData(PersonEntity entity) {
        this.firstName = entity.getFirstName();
        this.lastName = entity.getLastName();
        this.hkid = entity.getHkid();
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
