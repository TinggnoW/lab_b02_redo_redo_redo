package com.fsse2401.lab_b02_redo_redo_redo.API;

import com.fsse2401.lab_b02_redo_redo_redo.DATA.PERSON.DOMAIN.*;
import com.fsse2401.lab_b02_redo_redo_redo.DATA.PERSON.DTO.*;
import com.fsse2401.lab_b02_redo_redo_redo.SERVICE.PersonService;
import com.fsse2401.lab_b02_redo_redo_redo.SERVICE.SERVICEIMPL.PersonServiceImpl;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RestController
public class PersonApi {


    @Autowired
    private final PersonService personService;

    public PersonApi(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/person")
    public CreatePersonResponseDto createPerson (@RequestBody CreatePersonRequestDto requestDto){
        CreatePersonRequestData createPersonRequestData = new CreatePersonRequestData(requestDto);
        CreatePersonResponseData createPersonResponseData = personService.createPerson(createPersonRequestData);
        CreatePersonResponseDto createPersonResponseDto = new CreatePersonResponseDto(createPersonResponseData);
        return createPersonResponseDto;

    }

    @GetMapping("/person")
    public List<GetAllPeopleResponseDto> getAllPeopleResponseDto (){
        List<GetAllPeopleResponseData> getAlldata = personService.getAllPeople();
        List<GetAllPeopleResponseDto> getAlldto = new ArrayList<>();
        for (GetAllPeopleResponseData dto: getAlldata){
            GetAllPeopleResponseDto responseDto = new GetAllPeopleResponseDto(dto);
            getAlldto.add(responseDto);
        }
        return getAlldto;
    }

    @PutMapping("/person")
    public PersonResponseDto updatePerson (@RequestBody UpdatePersonRequestDto requestDto){

        UpdatePersonRequestData updatePersonRequestData = new UpdatePersonRequestData(requestDto);
        PersonResponseData personResponseData = personService.updatePerson(updatePersonRequestData);
        PersonResponseDto updatedto = new PersonResponseDto(personResponseData);
        return updatedto;
    }

    @DeleteMapping("/person")
    public PersonResponseDto deletePerson (@RequestParam String hkid){
        PersonResponseData personResponseData = personService.deletePerson(hkid);
        PersonResponseDto personResponseDto = new PersonResponseDto(personResponseData);
        return personResponseDto;
    }

    @GetMapping("/person{lastname}")
    public  List<PersonResponseDto> getbylastname (@PathVariable String lastname){
        List<PersonResponseDto> getbylastnamedtolist = new ArrayList<>();
        List<PersonResponseData> personResponseDatalist = personService.getbylastname(lastname);
        for(PersonResponseData data:personResponseDatalist){
            PersonResponseDto dto = new PersonResponseDto(data);
            getbylastnamedtolist.add(dto);
        }
        return getbylastnamedtolist;
    }

}

