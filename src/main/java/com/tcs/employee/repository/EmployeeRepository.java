package com.tcs.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	

}
