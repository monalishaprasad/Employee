package com.employee.employeeDetails.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.employeeDetails.model.Employee;
import com.employee.employeeDetails.repository.EmployeeRepository;

@Service
public class EmployeeServices {

	@Autowired
	private EmployeeRepository empRepo;

	public Employee addEmpDetails(Employee empDetail) {

		Employee empDetails = empRepo.save(empDetail);

		return empDetails;
	}

	public List<Employee> getEmpDetail() {
		
		List<Employee> getEmp = empRepo.findAll();
		
		return getEmp;
	}

}
