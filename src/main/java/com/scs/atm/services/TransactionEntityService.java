package com.scs.atm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scs.atm.entities.TransactionEntity;
import com.scs.atm.repository.TransactionEntityRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TransactionEntityService {

	@Autowired
	TransactionEntityRepository transactionentityrepository;
	
	public List<TransactionEntity> findall() {
		return transactionentityrepository.findAll();
	}
}
