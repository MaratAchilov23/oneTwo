package com.rost.demo.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;

@Component
public class PersonDao {
    @PersistenceContext
    private final EntityManager entityManager;

    public PersonDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

}
