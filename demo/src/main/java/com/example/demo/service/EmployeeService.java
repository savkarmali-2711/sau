package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmp();
	
	Employee getEmpById(long empId);

	void saveEmp(Employee employee);

	void updateEmp(Employee employee, long empId);

	void deleteEmp(long empId);

	List<Employee> getEmpByDept(String dept);

	

	

}
