package com.julionepomcueno.workshopspringboot3jpa.services;

import com.julionepomcueno.workshopspringboot3jpa.entities.Category;
import com.julionepomcueno.workshopspringboot3jpa.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findall() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> Category = repository.findById(id);
        return Category.get();
    }
}
