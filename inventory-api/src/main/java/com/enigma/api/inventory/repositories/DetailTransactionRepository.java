package com.enigma.api.inventory.repositories;

import com.enigma.api.inventory.entities.DetailTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailTransactionRepository extends JpaRepository<DetailTransaction, Integer> {

}
