package com.example.dockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docerdemo")
public class DockerController {
	
	@GetMapping("/")
	public String dockerExample() {
		return "This docker demo";
	}

}
