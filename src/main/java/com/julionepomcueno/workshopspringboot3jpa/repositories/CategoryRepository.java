package com.julionepomcueno.workshopspringboot3jpa.repositories;

import com.julionepomcueno.workshopspringboot3jpa.entities.Category;
import com.julionepomcueno.workshopspringboot3jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
