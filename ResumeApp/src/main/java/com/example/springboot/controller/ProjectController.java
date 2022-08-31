package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.ProjectModel;
import com.example.springboot.service.ProjectService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class ProjectController {

	@Autowired
	private ProjectService projectservice;
	
	@GetMapping("/projects")
	public List<ProjectModel> getAllProjects()
	{
		return projectservice.getProjects();
	}
}
