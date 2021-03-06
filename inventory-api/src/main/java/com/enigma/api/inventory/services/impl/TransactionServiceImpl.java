package com.enigma.api.inventory.services.impl;

import com.enigma.api.inventory.entities.Transaction;
import com.enigma.api.inventory.repositories.TransactionRepository;
import com.enigma.api.inventory.services.TransactionService;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl
        extends CommonServiceImpl<Transaction, Integer>
        implements TransactionService {


    public TransactionServiceImpl(TransactionRepository repository) {
        super(repository);
    }

}
