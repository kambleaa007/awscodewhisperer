package com.aws.codewhsiperdemo.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class GreetingController {

	private final String lambda1String = "";

	@RequestMapping("/")
	public ModelAndView index(Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		ModelAndView modelAndView = new ModelAndView();
    	

		if (!(auth instanceof AnonymousAuthenticationToken))
		{
			modelAndView.setViewName("success.html");
			return modelAndView;
		}
		modelAndView.setViewName("error.html");
		// if it is not authenticated, then go to the error...

		return modelAndView;
	}

	@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new String("Hello World!!!");
	}
}
