package com.julionepomcueno.workshopspringboot3jpa.resources;

import com.julionepomcueno.workshopspringboot3jpa.entities.Category;
import com.julionepomcueno.workshopspringboot3jpa.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>> findall() {
        List<Category> list = service.findall();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value ="/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category Category = service.findById(id);
        return ResponseEntity.ok().body(Category);
    }
}
