package com.ankit.Ecom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
@GetMapping(path = "/hw")
public String helloWorld() {
		return "Hello World";
	}

@GetMapping(path = "/hwb")
public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello world Bean");
	}

@GetMapping(path = "/hwb/{name}")
public HelloWorldBean helloWorldPathBean(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello world %s", name));
	}
}
