package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Project;

public interface ProjectService {

	List<Project> getAllProjects();

	List<Project> getProjectList(long empId);
	
	Project getProjectById(int projId);

	void addProject(Project proj);

	void updateProject(Project proj);

	void deleteProjectById(int id);

	
}
