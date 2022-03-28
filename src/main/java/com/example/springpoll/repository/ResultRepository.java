package com.example.springpoll.repository;

import com.example.springpoll.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultRepository extends JpaRepository<Answer, Integer> {

}
