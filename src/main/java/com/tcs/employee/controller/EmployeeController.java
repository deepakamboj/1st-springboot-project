package com.tcs.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")

public class EmployeeController {
	@GetMapping("/check")
	public String msg() {
		return "ok";
	}

}
