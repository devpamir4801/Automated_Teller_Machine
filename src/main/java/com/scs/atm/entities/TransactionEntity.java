package com.scs.atm.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "transaction_entity")
@Getter
@Setter
public class TransactionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long T_id;
	@Column(name = "Deposit")
	private Long Deposit;
	@Column(name = "Withdrawl")
	private Long Withdrawl;
	@Column(name = "Balance")
	private Long Balance;
	@Column(name = "date_time", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", updatable = false)
	private LocalDateTime date_time;
	public TransactionEntity(Long t_id, Long deposit, Long withdrawl, Long balance, LocalDateTime date_time) {
		super();
		T_id = t_id;
		Deposit = deposit;
		Withdrawl = withdrawl;
		Balance = balance;
		this.date_time = date_time;
	}
	
	
}
