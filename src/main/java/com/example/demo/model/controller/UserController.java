package com.example.demo.model.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    UsersRepository usersRepository;

    @GetMapping("/all")
    public List<User> getAll(){
        return usersRepository.findAll();
    }
    @PostMapping("/save")
    public List<User> save(@RequestBody final User user){
        usersRepository.save(user);
        return usersRepository.findAll();
    }
}
