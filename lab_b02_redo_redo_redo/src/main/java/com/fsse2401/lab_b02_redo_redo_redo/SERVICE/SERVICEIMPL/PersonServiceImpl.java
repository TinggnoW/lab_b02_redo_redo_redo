package com.fsse2401.lab_b02_redo_redo_redo.SERVICE.SERVICEIMPL;


import com.fsse2401.lab_b02_redo_redo_redo.DATA.PERSON.DOMAIN.*;
import com.fsse2401.lab_b02_redo_redo_redo.DATA.PERSON.ENTITY.PersonEntity;
import com.fsse2401.lab_b02_redo_redo_redo.EXCEPTION.DataMissingException;
import com.fsse2401.lab_b02_redo_redo_redo.EXCEPTION.PersonNotFoundException;
import com.fsse2401.lab_b02_redo_redo_redo.SERVICE.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    Logger logger = LoggerFactory.getLogger(PersonServiceImpl.class);


    List<PersonEntity> personEntityList = new ArrayList<>();

    @Override
    public  CreatePersonResponseData createPerson(CreatePersonRequestData data){
      PersonEntity personEntity = new PersonEntity(data);
      personEntityList.add(personEntity);
      CreatePersonResponseData responseData = new CreatePersonResponseData(personEntity);
      return responseData;
    }

    @Override
    public List<GetAllPeopleResponseData> getAllPeople(){
        List<GetAllPeopleResponseData> getall = new ArrayList<>();
        for(PersonEntity personEntity:personEntityList){
            GetAllPeopleResponseData getAllPeopleResponseData = new GetAllPeopleResponseData(personEntity);
            getall.add(getAllPeopleResponseData);
        }
        return getall;
    }
    @Override
    public PersonResponseData updatePerson(UpdatePersonRequestData updatedata){
        try{
            if (updatedata.getHkid()==null||
                updatedata.getFirstName()==null||
                updatedata.getLastName()==null){
                throw new DataMissingException();
            }
            PersonEntity personEntity = checkHkid(updatedata.getHkid());
            personEntity.setLastName(updatedata.getLastName());
            personEntity.setFirstName(updatedata.getFirstName());
            PersonResponseData uptodate = new PersonResponseData(personEntity);
            return uptodate;

        }catch(PersonNotFoundException ex){
            logger.info("Update Person: Person Not Found!");
            throw ex;
        }catch(DataMissingException ex){
            logger.info("Update Person: DataMissing" + updatedata );
            throw ex;
        }

    }
    @Override
    public PersonResponseData deletePerson(String hkid){

        try{
            PersonEntity personEntity = checkHkid(hkid);
            personEntityList.remove(personEntity);
            PersonResponseData personResponseData = new PersonResponseData(personEntity);
            return personResponseData;
        }catch (PersonNotFoundException ex){
            logger.info("Delete Person: Person not found!");
            throw ex;
        }

    }

    @Override
    public List<PersonResponseData> getbylastname(String lastname){
        List<PersonResponseData> getbylastnamelist = new ArrayList<>();
        for(PersonEntity personEntity:personEntityList){
            if(personEntity.getLastName().equals(lastname)){
                PersonResponseData data = new PersonResponseData(personEntity);
                getbylastnamelist.add(data);
            }
        }
        return getbylastnamelist;

    }


    public PersonEntity checkHkid(String hkid){
        for(PersonEntity checking:personEntityList){
            if(checking.getHkid().equals(hkid)){
                return checking;
            }
        }
        throw new PersonNotFoundException();
    }


}
