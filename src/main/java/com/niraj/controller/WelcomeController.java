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
		System.out.println("Change on 19th April Just Checking Token");
		return "news rest end point added";
     }

	
	// This is for local commit switch
	@RequestMapping("/product")
	public String product() {
		System.out.println("Adding product REST");
		return "product rest point added";
     }
	
	@RequestMapping("/dashboard")
	public String dashboard() {
		System.out.println("Adding comment on dashboard function");
		return "dashboard";
	}	
	
}
