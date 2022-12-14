package com.revature.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.UserRole;



@Repository
@Transactional
public interface UserRolesRepository extends JpaRepository <UserRole, Integer> {

}