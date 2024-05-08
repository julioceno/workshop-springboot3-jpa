package com.julionepomcueno.workshopspringboot3jpa.repositories;

import com.julionepomcueno.workshopspringboot3jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
