package com.julionepomcueno.workshopspringboot3jpa.resources;

import com.julionepomcueno.workshopspringboot3jpa.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findall() {
        User u = new User(1L, "maria", "maria@gmail.com", "23", "senha");
        return ResponseEntity.ok().body(u);
    }
}
