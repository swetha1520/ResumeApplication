package com.example.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.model.ProjectModel;
import com.example.springboot.repository.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectrepo;
	
	public List<ProjectModel> getProjects()
	{
		return projectrepo.findAll();
	}
}