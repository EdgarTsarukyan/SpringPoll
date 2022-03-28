package com.example.springpoll.repository;

import com.example.springpoll.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
  List<Question> findAllByPollId(int id);
}
