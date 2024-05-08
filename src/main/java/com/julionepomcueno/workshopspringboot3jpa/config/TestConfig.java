package com.julionepomcueno.workshopspringboot3jpa.config;

import com.julionepomcueno.workshopspringboot3jpa.entities.User;
import com.julionepomcueno.workshopspringboot3jpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Maria Brown", "maria@gmail.com", "32", "32");
        User user2 = new User(null, "Alex Green", "alex@gmail.com", "54", "55");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
