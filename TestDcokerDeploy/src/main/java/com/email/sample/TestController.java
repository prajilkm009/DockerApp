package com.email.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping(value = "/DockerProducts")
	public String index() {
		return "Products";
	}

}
