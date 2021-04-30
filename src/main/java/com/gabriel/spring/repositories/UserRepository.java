package com.gabriel.spring.repositories;

import com.gabriel.spring.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
    


    
}
