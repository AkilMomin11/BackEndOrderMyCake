package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.FeedbackService;
import com.example.demo.services.LoginService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class FeedbackController {
	
	@Autowired
	FeedbackService fservice;

}
