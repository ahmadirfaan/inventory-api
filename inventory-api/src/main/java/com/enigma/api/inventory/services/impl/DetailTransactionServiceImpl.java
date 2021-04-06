package com.enigma.api.inventory.services.impl;

import com.enigma.api.inventory.entities.DetailTransaction;
import com.enigma.api.inventory.repositories.DetailTransactionRepository;
import com.enigma.api.inventory.services.DetailTransactionService;
import org.springframework.stereotype.Service;

@Service
public class DetailTransactionServiceImpl
        extends CommonServiceImpl<DetailTransaction, Integer>
        implements DetailTransactionService {


    public DetailTransactionServiceImpl(DetailTransactionRepository repository) {
        super(repository);
    }
}
