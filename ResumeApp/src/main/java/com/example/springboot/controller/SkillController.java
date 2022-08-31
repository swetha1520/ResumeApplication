package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.SkillModel;
import com.example.springboot.service.SkillService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class SkillController {

	@Autowired
	private SkillService skillservice;
	
	@GetMapping("/skills")
	public List<SkillModel> getAllSkills()
	{
		return skillservice.getSkills();
	}
}
