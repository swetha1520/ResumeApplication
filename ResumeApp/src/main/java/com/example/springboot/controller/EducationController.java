package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.EducationModel;
import com.example.springboot.service.EducationService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class EducationController {

	@Autowired
	private EducationService educservice;
	
	@GetMapping("/education")
	public List<EducationModel> getEducation()
	{
		return educservice.getEduacationDetails();
	}
}
