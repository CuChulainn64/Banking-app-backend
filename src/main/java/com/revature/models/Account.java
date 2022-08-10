package com.revature.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//might add account types later

public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	

	@Column(name="amount")
	private double amount;
	
	@ManyToOne
	@JoinColumn(name = "member_id", nullable = false, table="users")
	private long user_id;

	public Account(double amount, long user_id) {
		super();
		this.amount = amount;
		this.user_id = user_id;
	}

	public Account() {
		super();
	}

	public Account(long id, double amount, long user_id) {
		super();
		this.id = id;
		this.amount = amount;
		this.user_id = user_id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, id, user_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount) && id == other.id
				&& user_id == other.user_id;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", amount=" + amount + ", user_id=" + user_id + "]";
	}

}
