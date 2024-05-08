package com.julionepomcueno.workshopspringboot3jpa.services;

import com.julionepomcueno.workshopspringboot3jpa.entities.Order;
import com.julionepomcueno.workshopspringboot3jpa.entities.User;
import com.julionepomcueno.workshopspringboot3jpa.repositories.OrderRepository;
import com.julionepomcueno.workshopspringboot3jpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findall() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> user = repository.findById(id);
        return user.get();
    }
}
