package com.gabriel.spring.repositories;

import com.gabriel.spring.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long>{
    


    
}
