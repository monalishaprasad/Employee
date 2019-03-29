package com.employee.employeeDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employeeDetails.Services.EmployeeServices;
import com.employee.employeeDetails.model.Employee;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	private EmployeeServices empService;
	
	@PostMapping
	public Employee setAllEmpDetails(@RequestBody Employee empDetail){
		
		Employee emp = empService.addEmpDetails(empDetail);
		
		return emp;
		
	}
	
	@GetMapping
	public List<Employee> getAllEmpDetails(){
		
		List<Employee> empDetail = empService.getEmpDetail();
				
		return empDetail;
		
	}
}
