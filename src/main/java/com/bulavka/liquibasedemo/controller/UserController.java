package com.bulavka.liquibasedemo.controller;

import com.bulavka.liquibasedemo.repository.UserRepository;
import com.bulavka.liquibasedemo.repository.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/api/users")
    public List<User> allUsers() {
        return userRepository.findAll();
    }
}
