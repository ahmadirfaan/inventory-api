package com.enigma.api.inventory.services;

import com.enigma.api.inventory.entities.Item;
import com.enigma.api.inventory.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface ItemService extends CommonService<Item, Integer> {

//    public Item addWithUnit(Item entity);
}
