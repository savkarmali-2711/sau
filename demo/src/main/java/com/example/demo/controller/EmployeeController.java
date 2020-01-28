package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/employees")
	public List<Employee> geyAllEmployees(){
		return employeeService.getAllEmp();
	}
	
	@RequestMapping("/employee/{empId}")
	public Employee getEmpById(@PathVariable long empId) {
		return employeeService.getEmpById(empId);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/employees")
	public void addEmp(@RequestBody Employee employee) {
		employeeService.saveEmp(employee);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/employees/{empId}")
	public void updateEmp(@RequestBody Employee employee,@PathVariable long empId) {
		employeeService.updateEmp(employee,empId);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/employees/{empId}")
	public void deleteEmp(@PathVariable long empId) {
		employeeService.deleteEmp(empId);
	}
	
	@RequestMapping("/employees/dept/{dept}")
	public List<Employee> getEmpByDept(@PathVariable String dept) {
		return employeeService.getEmpByDept(dept);
	}
}
