package com.julionepomcueno.workshopspringboot3jpa.services;

import com.julionepomcueno.workshopspringboot3jpa.entities.Product;
import com.julionepomcueno.workshopspringboot3jpa.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findall() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> Product = repository.findById(id);
        return Product.get();
    }
}
