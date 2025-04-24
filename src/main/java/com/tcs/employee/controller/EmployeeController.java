package com.tcs.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.employee.entity.Employee;
import com.tcs.employee.service.EmployeeService;

@RestController
@RequestMapping("/emp")

public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/check")
	public String msg() {
		return "ok";
	}
	
	@GetMapping("/{id}")
	public Employee getById(@PathVariable int id) {		
		Employee get = employeeService.getById(id);
		return get;
	}
	@GetMapping("/getAll")
	public List<Employee> getAll(){
		return employeeService.getAll();
	}
	@PostMapping("/post")
	public Employee save(@RequestBody Employee emp) {
		Employee save = employeeService.save(emp);
		return save;
	}
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {		
		 employeeService.delete(id);
		 return "Employee successfully deleted";
	}

}
