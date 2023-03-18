package com.rost.demo.service;


import com.rost.demo.models.Person;
import com.rost.demo.repository.PersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class PeopleService {

    private final PersonRepository personRepository;

    public PeopleService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> findAll(){
        return personRepository.findAll();
    }

   public Person findOne(int id){
        Optional<Person>foundPerson = personRepository.findById(id);
        return foundPerson.orElse(null);
    }
    @Transactional
    public void save(Person person){
        person.setTimeCreated((java.sql.Date) new Date());
        personRepository.save(person);
    }
    @Transactional
    public void update(int id, Person updatedPerson){
        updatedPerson.setId(id);
        personRepository.save(updatedPerson);
    }
    @Transactional
    public void deleteById(int id){
        personRepository.deleteById(id);
    }
    public void test(){
        System.out.println("Testing here with debug. Inside Hibernate transaction");
    }



}
