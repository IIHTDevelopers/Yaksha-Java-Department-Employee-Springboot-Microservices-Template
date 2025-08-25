package com.employee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.exception.NotFoundException;
import com.employee.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee createEmployee(Employee employee) {
		return null;
	}

	public Optional<Employee> getEmployee(Long id) {
		return null;
	}

	public Employee updateEmployee(Long id, Employee updatedEmployee) {
		return null;
	}
}

