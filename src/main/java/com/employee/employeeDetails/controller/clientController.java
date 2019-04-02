package com.employee.employeeDetails.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employeeDetails.Services.EmployeeManagementServices;
import com.employee.employeeDetails.model.Employee;



@RestController
public class clientController {
	
	@Autowired
	private EmployeeManagementServices empService;
	

	@GetMapping("/getSal/{salary}/age/{age}/status/{status}")
	public List<Employee> getSal(@PathVariable long salary,@PathVariable int age, @PathVariable boolean status) {
	
		List<Employee>  emp = new ArrayList<>();
		try{
			emp = empService.empSalary(salary,age,status);
		}catch(Exception e) {
			return emp;
		}
		 
		return  emp  ;
		
	}
}
