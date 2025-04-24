package com.tcs.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.employee.entity.Employee;
import com.tcs.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee getById(int id) {

		Optional<Employee> record = employeeRepository.findById(id);

		return record.get();
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> listEmp= employeeRepository.findAll();
		return listEmp;
	}

	@Override
	public Employee save(Employee emp) {
		Employee save = employeeRepository.save(emp);
		return save;
	}

	@Override
	public Employee update(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		employeeRepository.deleteById(id);
		
	}

}
