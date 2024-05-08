package com.julionepomcueno.workshopspringboot3jpa.resources;

import com.julionepomcueno.workshopspringboot3jpa.entities.Order;
import com.julionepomcueno.workshopspringboot3jpa.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
    @Autowired
    private OrderService service;

    @GetMapping
    public ResponseEntity<List<Order>> findall() {
        List<Order> list = service.findall();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value ="/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order Order = service.findById(id);
        return ResponseEntity.ok().body(Order);
    }
}
