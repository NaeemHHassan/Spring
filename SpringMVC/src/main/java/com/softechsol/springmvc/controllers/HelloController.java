package com.softechsol.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView view = new ModelAndView();
		view.setViewName("hello");
		view.addObject("id", 341);
		System.out.println("Hello Servelets");
		return view;

	}
}
