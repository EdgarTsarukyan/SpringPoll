package com.example.springpoll.repository;

import com.example.springpoll.model.Poll;
import com.example.springpoll.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PollRepository extends JpaRepository<Poll, Integer> {
}
