package com.employee.employeeDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.employeeDetails.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
