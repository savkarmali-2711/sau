package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.model.Project;
import com.example.demo.service.ProjectService;

@RestController
public class ProjectController {

	@Autowired
	ProjectService projectService;
	
	@GetMapping("/projects")
	public List<Project> getAllProjects(){
		return projectService.getAllProjects();
	}

	@GetMapping("/employees/{empId}/projects")
	public List<Project> getProjectList(@PathVariable long empId){
		System.out.println("In Project Controller");
		List<Project> projList=projectService.getProjectList(empId);
		System.out.println(projList);
		return projList;
	}
	
	@GetMapping("/employees/{empId}/projects/{projId}")
	public Project getProjectById(@PathVariable int projId) {
		return projectService.getProjectById(projId);
	}
	
	@PostMapping("/employees/{empId}/projects")
	public void addProject(@RequestBody Project proj,@PathVariable long empId) {
		proj.setEmployee(new Employee(empId,"",""));
		projectService.addProject(proj);
	}
	
	@PutMapping("/employees/{empId}/projects/{projId}")
	public void updateProject(@RequestBody Project proj,@PathVariable long empId) {
		proj.setEmployee(new Employee(empId,"",""));
		projectService.updateProject(proj);
	}
	
	@DeleteMapping
	public void deleteProjById(@PathVariable int id) {
		projectService.deleteProjectById(id);
	}
}
