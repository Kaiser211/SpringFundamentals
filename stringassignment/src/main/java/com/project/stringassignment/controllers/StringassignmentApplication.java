package com.project.stringassignment.controllers;

import java.security.Principal;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@SpringBootApplication
@RestController
public class StringassignmentApplication {
	public static void main(String[] args) {
		SpringApplication.run(StringassignmentApplication.class, args);
	}
	
	@RequestMapping("/")
	public String Index(){
		return "Hello Kashaer! How are you doing?";
	}
	
	@RequestMapping("/random")
	public String Random(){
		return "Spring boot is great! So easy to respond with just strings.";
	}
}