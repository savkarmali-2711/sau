package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

//	public List<Employee> empList = new ArrayList<Employee>(Arrays.asList(
//			new Employee(10001, "A", "a@g"), 
//			new Employee(10002, "B", "b@g"),
//			new Employee(10003, "D", "c@g")));
//	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
//		return empList;
		return empRepo.findAll();
	}

	@Override
	public Employee getEmpById(long empId) {
		// TODO Auto-generated method stub
//		return empList.stream().filter(e -> e.getId() == empId).findFirst().get();
		return empRepo.getOne(empId);
	}

	@Override
	public void saveEmp(Employee employee) {
		// TODO Auto-generated method stub
//		empList.add(employee);
		empRepo.save(employee);
	}

	@Override
	public void updateEmp(Employee employee, long empId) {
		// TODO Auto-generated method stub
//		for(int i=0;i<empList.size();i++)
//		{
//			Employee e=empList.get(i);
//			if(e.getId()==empId) {
//				empList.set(i, employee);
//				return;
//			}
//		}
		empRepo.save(employee);
	}

	@Override
	public void deleteEmp(long empId) {
		// TODO Auto-generated method stub
//		empList.removeIf(e->e.getId()==empId);
		empRepo.deleteById(empId);
	}

	@Override
	public List<Employee> getEmpByDept(String dept) {
		// TODO Auto-generated method stub
		return empRepo.findByDept(dept);
	}
	
}
