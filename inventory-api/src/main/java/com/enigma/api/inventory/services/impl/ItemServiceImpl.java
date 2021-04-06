package com.enigma.api.inventory.services.impl;

import com.enigma.api.inventory.entities.Item;
import com.enigma.api.inventory.entities.Unit;
import com.enigma.api.inventory.repositories.ItemRepository;
import com.enigma.api.inventory.services.ItemService;
import com.enigma.api.inventory.services.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ItemServiceImpl extends CommonServiceImpl<Item,Integer> implements ItemService {


//    @Autowired
//    private UnitService unitService;

    @Autowired
    public ItemServiceImpl(ItemRepository repository) {
        super(repository);
    }

    // @Transactional // Digunakan lebih dari 1 proses pada query dan ingin jika satu gagal maka semua gagal maka ditambah annotasi transactional
//    @Override
//    public Item addWithUnit(Item entity) {
//        Unit unit = unitService.save(entity.getUnit());
//        entity.setUnit(unit);
//
//        return repository.save(entity);
//    }

}
