package com.domain.models.repos;

import com.domain.models.Supplier;

import org.springframework.data.repository.CrudRepository;

public interface SupplierRepo extends CrudRepository<Supplier, Long> {
    
}
