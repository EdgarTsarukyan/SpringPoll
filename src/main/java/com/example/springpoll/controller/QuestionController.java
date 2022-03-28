package com.example.springpoll.controller;

import com.example.springpoll.model.Answer;
import com.example.springpoll.model.Poll;
import com.example.springpoll.model.Question;
import com.example.springpoll.model.User;
import com.example.springpoll.repository.AnswerRepository;
import com.example.springpoll.repository.PollRepository;
import com.example.springpoll.repository.QuestionRepository;
import com.example.springpoll.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class QuestionController {

    @Autowired
    QuestionRepository questionRepository;
    @Autowired
    PollRepository pollRepository;
    @Autowired
    AnswerRepository answerRepository;

    @GetMapping("/questions/{id}")
    public String questions(@PathVariable("id") int id, ModelMap modelMap) {
        List<Question> allById = questionRepository.findAllByPollId(id);
        Poll byId = pollRepository.getById(id);
        List<Answer> all = answerRepository.findAll();
        modelMap.addAttribute("answers", all );
        modelMap.addAttribute("questions", allById);
        modelMap.addAttribute("poll", byId);
        return "question";
    }

}
