package com.howtodoinjava.jersey.service;

import org.springframework.stereotype.Component;

/**
 * 
 * @author manjusuresh
 *
 */
@Component
public class HelloServiceImpl {

	public String call() {
		if(true) {
			System.out.println();
		} else {
			System.out.println();
		}
		return "{\"name\" : \"Hello World !! - suresh1 Averineni\"}";
	}
}
