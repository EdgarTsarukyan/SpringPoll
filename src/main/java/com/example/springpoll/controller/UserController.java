package com.example.springpoll.controller;

import com.example.springpoll.model.User;
import com.example.springpoll.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;


    @GetMapping("/register")
    public String userRegister() {
        return "register";
    }

    @PostMapping("/register")
    public String saveUser(@ModelAttribute User user) {
        userRepository.save(user);
        return "login";
    }

}
