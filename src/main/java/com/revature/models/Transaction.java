package com.revature.models;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne
	@JoinColumn(name = "source_account", nullable = true, table="accounts")
	private long sourceAccount;
	
	@ManyToOne
	@JoinColumn(name = "target_accountI", nullable = false, table="accounts")
	private long targetAccount;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public TransactionType getType() {
		return type;
	}

	public void setType(TransactionType type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public long getSourceAccount() {
		return sourceAccount;
	}

	public void setSourceAccount(long sourceAccount) {
		this.sourceAccount = sourceAccount;
	}

	public long getTargetAccount() {
		return targetAccount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, id, sourceAccount, targetAccount, time, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount) && id == other.id
				&& sourceAccount == other.sourceAccount && targetAccount == other.targetAccount
				&& Objects.equals(time, other.time) && type == other.type;
	}

	public Transaction() {
		super();
	}

	public Transaction(TransactionType type, double amount, LocalDateTime time, long sourceAccount,
			long targetAccount) {
		super();
		this.type = type;
		this.amount = amount;
		this.time = time;
		this.sourceAccount = sourceAccount;
		this.targetAccount = targetAccount;
	}

	public Transaction(long id, TransactionType type, double amount, LocalDateTime time, long sourceAccount,
			long targetAccount) {
		super();
		this.id = id;
		this.type = type;
		this.amount = amount;
		this.time = time;
		this.sourceAccount = sourceAccount;
		this.targetAccount = targetAccount;
	}

	public void setTargetAccount(long targetAccount) {
		this.targetAccount = targetAccount;
	}
	
	
}
