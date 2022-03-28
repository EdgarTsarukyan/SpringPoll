package com.example.springpoll.controller;

import com.example.springpoll.model.Answer;
import com.example.springpoll.model.Poll;
import com.example.springpoll.model.Question;
import com.example.springpoll.repository.AnswerRepository;
import com.example.springpoll.repository.PollRepository;
import com.example.springpoll.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class AnswerController {

    @Autowired
    AnswerRepository answerRepository;

//    @GetMapping("/answers")
//    public String questions(ModelMap modelMap) {
//        List<Answer> all = answerRepository.findAll();
//        modelMap.addAttribute("answers", all );
//        return "question";
//    }

}
