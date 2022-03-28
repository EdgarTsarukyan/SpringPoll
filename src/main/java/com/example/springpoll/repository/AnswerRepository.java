package com.example.springpoll.repository;

import com.example.springpoll.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
 // List<Question> findAllByPollId(int id);
}
