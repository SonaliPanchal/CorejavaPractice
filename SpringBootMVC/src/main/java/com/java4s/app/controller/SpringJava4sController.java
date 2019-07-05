package com.java4s.app.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SpringJava4sController {
	
	@GetMapping("/")
	public ModelAndView getLoginpage(Model model)
	{
		model.addAttribute("message","welcome to java 4s spring tutorials");
		return new ModelAndView("welcomePage");
		
	}
	
	@GetMapping("/hello")
	public String SayHello()
	{
		return "hello this sonali";
		
	}
	

}
