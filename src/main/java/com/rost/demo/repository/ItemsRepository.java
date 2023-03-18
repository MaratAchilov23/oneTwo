package com.rost.demo.repository;

import com.rost.demo.models.Item;
import com.rost.demo.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemsRepository extends JpaRepository<Item,Integer> {
    List<Item> findItemByTitle(String title);

    List<Item>findItemByPerson(Person person);


}
