package com.rost.demo.service;

import com.rost.demo.models.Item;
import com.rost.demo.models.Person;
import com.rost.demo.repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ItemService {
    private final ItemsRepository itemsRepository;
    @Autowired
    public ItemService(ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }
    public List<Item> findItemByItemName(String name){
        return itemsRepository.findItemByTitle(name);
    }

    public List<Item>findByOwner(Person person){
        return itemsRepository.findItemByPerson(person);
    }


}
