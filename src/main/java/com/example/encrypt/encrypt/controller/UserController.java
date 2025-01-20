package com.example.encrypt.encrypt.controller;

import com.example.encrypt.encrypt.entity.User;
import com.example.encrypt.encrypt.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/a")
    public List<User> x() {
        return userRepo.findAll();
    }
}
