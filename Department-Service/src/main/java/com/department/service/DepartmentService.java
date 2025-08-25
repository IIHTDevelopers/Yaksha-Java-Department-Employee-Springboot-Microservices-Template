package com.department.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.department.dto.DepartmentResponse;
import com.department.dto.EmployeeDTO;
import com.department.entity.Department;
import com.department.exception.NotFoundException;
import com.department.repo.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private RestTemplate restTemplate;

	public Department save(Department dept) {
		return null;
	}

	public Optional<Department> get(Long id) {
		return null;
	}

	public Department update(Long id, Department dept) {
		return null;
	}

	public DepartmentResponse getDepartmentWithEmployee(Long id) {
		return null;
	}
}
