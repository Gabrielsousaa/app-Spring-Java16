package com.gabriel.spring.repositories;

import com.gabriel.spring.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
    
}
