package com.fsse2401.lab_b02_redo_redo_redo.SERVICE;

import com.fsse2401.lab_b02_redo_redo_redo.DATA.PERSON.DOMAIN.*;

import java.util.List;

public interface PersonService {

    CreatePersonResponseData createPerson(CreatePersonRequestData data);

    List<GetAllPeopleResponseData> getAllPeople();

    PersonResponseData updatePerson (UpdatePersonRequestData updatedata);

    PersonResponseData deletePerson(String hkid);

    List<PersonResponseData> getbylastname(String lastname);
}
