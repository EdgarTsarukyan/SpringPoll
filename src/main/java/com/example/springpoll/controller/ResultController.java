package com.example.springpoll.controller;

import com.example.springpoll.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class ResultController {

    @Autowired
    ResultRepository resultRepository;

    @PostMapping("/result")
    public String getResult() {

        return "result";
    }

}
