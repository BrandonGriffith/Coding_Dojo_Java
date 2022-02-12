package com.griffith.HelloHuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	@RequestMapping("/")
	public String index(@RequestParam(value = "name", required = false) String firstName,
			@RequestParam(value = "last_name", required = false) String lastName,
			@RequestParam(value = "times", required = false, defaultValue = "0") int times) {
		if (firstName != null) {
			if (lastName != null) {
				if (times > 0) {
					String result =("Hello " + firstName + " " + lastName + " ");
					for(int i=1;i<times;i++) {
						result += result;
					}
					return result;
				}
				return "Hello " + firstName + " " + lastName;
			}
			return "Hello " + firstName;
		}
		return "Hello Human";
	}
}
