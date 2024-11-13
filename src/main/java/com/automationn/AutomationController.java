package com.automationn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutomationController {
	
	@GetMapping(value="/getautomation")
	public String getAutomation(String a) {
		return "Hello";
	}

}
