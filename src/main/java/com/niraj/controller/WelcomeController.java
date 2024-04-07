package com.niraj.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeController {

	
	@RequestMapping("/")
	public String welcome() {
		System.out.println("In the Welcome controller root path" + new Date());
		System.out.println("Before any PUSH to gitHub");
		return "Welcome to Git-Colt project ";
     }
	
	@RequestMapping("/news")
	public String news() {
		System.out.println("Adding news REST end point");
		return "news rest end point added";
     }

}
