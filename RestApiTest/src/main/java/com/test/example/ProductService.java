package com.test.example;

import java.util.List;

import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
        
    @Autowired
    Repository productRepository;
    
    public List<ProductEntity> getAllProduct(){
        return ((Object) productRepository).findAll();
    }
        
    public ProductEntity getProduct(int id){
        return ((Object) productRepository).findById(id).get();
    }
        
    public void addProduct(ProductEntity pe){
        productRepository.save(pe);
    }
        
    public void updateProduct(int id, ProductEntity pe){
        if(productRepository.findById(id).isPresent()) {
            ProductEntity oldProductEntity=productRepository.findbyid(id).get();
            oldProductEntity.setName(pe.getName());
            oldProductEntity.setDescription(pe.getDescription());
            productRepository.save(oldProductEntity);
        }
    }
        
    public void deleteProduct(int id){
        productRepository.deleteById(id);       
    }
}

