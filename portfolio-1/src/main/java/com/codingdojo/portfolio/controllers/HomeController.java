package com.codingdojo.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class HomeController {
	@RequestMapping("")
	public String index() {
		return "index.html";
	}
	
	@RequestMapping("/me")
	public String aboutme() {
		return "aboutme.html";
	}
    @RequestMapping("/projects")
    public String projects() {
    		return "my_projects.html"; 
    	
    }
}
