package com.julionepomcueno.workshopspringboot3jpa.resources;

import com.julionepomcueno.workshopspringboot3jpa.entities.Product;
import com.julionepomcueno.workshopspringboot3jpa.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/products")
public class ProductResource {
    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findall() {
        List<Product> list = service.findall();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value ="/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product Product = service.findById(id);
        return ResponseEntity.ok().body(Product);
    }
}
