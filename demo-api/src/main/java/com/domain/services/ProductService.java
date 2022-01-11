package com.domain.services;

import java.util.List;

import javax.transaction.Transactional;

import com.domain.models.Product;
import com.domain.models.repos.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    //create update data
    public Product save(Product product){
        return productRepo.save(product);
    }

    //cari data berdasar id
    public Product findOne(Long id){
        return productRepo.findById(id).get();
    }

    //show semua data
    public Iterable<Product> findAll(){
        return productRepo.findAll();
    }

    //delete data berdasar id
    public void removeOne(Long id){
        productRepo.deleteById(id);
    }

    public List<Product> findByName(String name){
        return productRepo.findByNameContains(name);
    }
    
}
