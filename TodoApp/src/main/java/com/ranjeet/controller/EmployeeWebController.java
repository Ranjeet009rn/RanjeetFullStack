package com.ranjeet.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ranjeet.entity.Employee;
import com.ranjeet.repository.EmployeeRepository;

@Controller
@RequestMapping(value = "/employee")

public class EmployeeWebController {
@Autowired
	
	private EmployeeRepository employeeRepository;

	@GetMapping(value="")
	public String init(Model model) {
		model.addAttribute("employee",new Employee());
		
		List<Employee>employees=employeeRepository.findAll();
		model.addAttribute("employees",employees);
		
		return "index";
		
	}
	@PostMapping(value="/save",produces= {"application/json","application/xml"})
	public String saveEmployee(@ModelAttribute Employee employee,Model model)
	{
		employeeRepository.save(employee);
		model.addAttribute("employees",employeeRepository.findAll());
		return "index";
	}

}
