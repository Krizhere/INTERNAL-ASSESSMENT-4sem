package com.kiet.AIML_2B_FirstRestAPI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiet.AIML_2B_FirstRestAPI.model.Student;

@RestController
public class FirstrestController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello Rahul";
	}
	
	@RequestMapping("/student")
	public Student getStudent() {
		return new Student(101,"Rahul","Java@gmai;.com","cse","proffersor");
	}
	
}
