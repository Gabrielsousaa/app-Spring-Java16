package com.gabriel.spring.repositories;

import com.gabriel.spring.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    
}
