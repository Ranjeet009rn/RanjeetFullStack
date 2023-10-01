package com.ranjeet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ranjeet.entity.Employee;
import com.ranjeet.repository.EmployeeRepository;

@RestController
@RequestMapping(value = "/api/v1/employee")
public class EmployeeController {
	@Autowired
	
	private EmployeeRepository employeeRepository;
	
	@PostMapping(value = "/create")
	public Employee createEmployee( @RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}

	@GetMapping(value = "/getall")

	public List<Employee> getEmployees() {
		return employeeRepository.findAll() ;
	}

	@PutMapping(value = "/update")
	public Employee updateEmployee( @RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}

	@DeleteMapping(value = "/delete")
	public void deleteEmployee(int id) {
		 employeeRepository.deleteById(id);
	}

}
