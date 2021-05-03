package com.gabriel.spring.repositories;


import com.gabriel.spring.entities.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long>{
    


    
}
