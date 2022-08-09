package com.revature.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.revature.util.TransactionType;

@Entity
@Table(name="transactions")
public class Transaction {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="transaction_type")
	private TransactionType type;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="time")
	private LocalDateTime time;
	
	@Column(name="source")//fk can be null
	private long sourceAccount;
	
	@Column(name="target")//fk must not be null
	private long targetAccount;
	
	
}
