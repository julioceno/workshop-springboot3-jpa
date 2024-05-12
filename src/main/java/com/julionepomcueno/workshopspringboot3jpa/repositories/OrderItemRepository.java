package com.julionepomcueno.workshopspringboot3jpa.repositories;

import com.julionepomcueno.workshopspringboot3jpa.entities.OrderItem;
import com.julionepomcueno.workshopspringboot3jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
