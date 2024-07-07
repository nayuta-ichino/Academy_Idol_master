package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
	@GetMapping("")
	private String hello(){
	return "index.html";
	}
}
