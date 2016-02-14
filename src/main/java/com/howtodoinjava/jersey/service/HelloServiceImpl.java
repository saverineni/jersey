package com.howtodoinjava.jersey.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl {

	public String call() {
		return "{\"name\" : \"Hello World !! - suresh  Averineni\"}";
	}
}
