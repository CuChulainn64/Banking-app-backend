package com.revature.repositories;



import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Transaction;



@Repository
@Transactional
public interface TransactionRepository extends JpaRepository <Transaction, Integer> {

}