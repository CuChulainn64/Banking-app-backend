package com.revature.repositories;

import javax.transaction.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Account;

@Repository
@Transactional
public interface AccountRepository extends JpaRepository <Account, Integer> {

}
