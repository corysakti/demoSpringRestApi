package com.domain.models.repos;

import java.util.List;

import com.domain.models.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long> {
    
    //memberikan fitur %like% query
    List<Product> findByNameContains(String name);
}
