package com.scs.atm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scs.atm.entities.TransactionEntity;

public interface TransactionEntityRepository extends JpaRepository<TransactionEntity, Long>{
	
	
}
