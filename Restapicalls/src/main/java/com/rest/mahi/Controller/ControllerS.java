package com.rest.mahi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ControllerS {
	@GetMapping("/")
	public String homes() {
		return "countries";
	}
}
