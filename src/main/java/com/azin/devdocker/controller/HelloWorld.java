package com.azin.devdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@GetMapping("/")
	public String hello() {
		System.out.println("Chamando o recurso! Denovo com docker");
		return "Hello world! Oh my good";
	}

}
