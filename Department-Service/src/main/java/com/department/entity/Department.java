package com.department.entity;


public class Department {

	private Long id;

	private String name;

	private Long employeeId;

	public Department() {
		super();
	}

	public Department(Long id, String name, Long employeeId) {
		super();
		this.id = id;
		this.name = name;
		this.employeeId = employeeId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
}