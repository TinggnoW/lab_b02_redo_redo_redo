package com.fsse2401.lab_b02_redo_redo_redo.DATA.PERSON.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fsse2401.lab_b02_redo_redo_redo.DATA.PERSON.DOMAIN.PersonResponseData;

public class PersonResponseDto {
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("hkid_number")
    private String hkid;

    public PersonResponseDto(PersonResponseData data) {
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
