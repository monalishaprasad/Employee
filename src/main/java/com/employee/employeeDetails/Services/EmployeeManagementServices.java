package com.employee.employeeDetails.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.employeeDetails.model.Employee;
import com.employee.employeeDetails.repository.EmployeeRepository;

@Service
public class EmployeeManagementServices {

	@Autowired
	EmployeeRepository empRep;

	public List<Employee> empSalary(long salary,int age)  throws Exception {

		List<Employee> listEmp = new ArrayList<>();
		
		List<Employee> model = empRep.findAll();
		model.forEach(empl -> {
			if (empl.getSalary() >= salary && empl.getAge() >= age) {
				
				listEmp.add(empl);
				System.out.println(empl);
			}
		}); 	
		return listEmp ;	

		

	}

}
