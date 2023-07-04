package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Feedback;
import com.example.demo.entites.Login;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback , Integer> {

	
}
