package com.julionepomcueno.workshopspringboot3jpa.repositories;

import com.julionepomcueno.workshopspringboot3jpa.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
