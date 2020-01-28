package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProjectRepository;
import com.example.demo.model.Project;

@Service
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	ProjectRepository projDao;

	@Override
	public List<Project> getAllProjects() {
		// TODO Auto-generated method stub
		return projDao.findAll();
	}

	@Override
	public List<Project> getProjectList(long empId) {
		// TODO Auto-generated method stub
		System.out.println("in Dao class employee id "+empId);
		return projDao.findByEmployeeEmpId(empId);
	}

	@Override
	public Project getProjectById(int projId) {
		// TODO Auto-generated method stub
		return projDao.getOne(projId);
	}

	@Override
	public void addProject(Project proj) {
		// TODO Auto-generated method stub
		projDao.save(proj);
	}

	@Override
	public void updateProject(Project proj) {
		// TODO Auto-generated method stub
		projDao.save(proj);
	}

	@Override
	public void deleteProjectById(int id) {
		// TODO Auto-generated method stub
		projDao.deleteById(id);
	}
	
	
}
