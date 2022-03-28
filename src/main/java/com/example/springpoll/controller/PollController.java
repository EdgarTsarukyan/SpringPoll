package com.example.springpoll.controller;

import com.example.springpoll.model.Poll;
import com.example.springpoll.model.User;
import com.example.springpoll.repository.PollRepository;
import com.example.springpoll.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PollController {

    @Autowired
    PollRepository pollRepository;
    @Autowired
    UserRepository userRepository;

    @GetMapping("/loginPage")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute User user, ModelMap modelMap) {
        if (user.getEmail().equals("admin") && user.getPassword().equals("admin")) {
            return "adminPage";
        }
        List<User> all = userRepository.findAll();
        for (User user1 : all) {
            if (user1.getEmail().equals(user.getEmail()) && user1.getPassword().equals(user.getPassword())) {
                return "redirect:/polls";
            }
        }
        String msg = "Email or password is wrong";
        modelMap.addAttribute("msg", msg);
        return "login";
    }

    @GetMapping("/polls")
    public String finedAllPolls(ModelMap modelMap) {
        List<Poll> all = pollRepository.findAll();
        modelMap.addAttribute("polls", all);
        return "poll";
    }


}
