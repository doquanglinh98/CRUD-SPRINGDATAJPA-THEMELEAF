package com.springboot.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.crud.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
