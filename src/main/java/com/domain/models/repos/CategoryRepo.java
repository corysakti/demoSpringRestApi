package com.domain.models.repos;

import com.domain.models.Category;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, Long> {
    
}
