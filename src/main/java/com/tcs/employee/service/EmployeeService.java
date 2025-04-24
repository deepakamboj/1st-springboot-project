package com.tcs.employee.service;

import java.util.List;

import com.tcs.employee.entity.Employee;

public interface EmployeeService {
	public Employee getById(int id);
	public List<Employee> getAll();
	public Employee save(Employee emp);
	public Employee update(Employee emp);
	public void delete(int id);

}
