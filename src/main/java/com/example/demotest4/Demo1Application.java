package com.example.demotest4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to batch 2 training";
	}
	@GetMapping("/greeting")
	public String greeting() {
		return "good morning all!!!";
	}
	@GetMapping("/goodbye")
	public String hello() {
		return "Good bye friends!!!";

}
	
}
