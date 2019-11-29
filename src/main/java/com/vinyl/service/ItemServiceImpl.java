package com.vinyl.service;

import com.vinyl.model.Item;
import com.vinyl.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService{
    @Autowired
    private ItemRepository itemRepository;

    @Override
    public void save(Item item){
        itemRepository.save(item);
    }

    @Override
    public Optional<Item> findById(Long id){
        return itemRepository.findById(id);
    }
}