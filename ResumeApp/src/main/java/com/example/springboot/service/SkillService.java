package com.example.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.model.SkillModel;
import com.example.springboot.repository.SkillRepository;

@Service
public class SkillService {

	@Autowired
	private SkillRepository skillrepo;
	
	public List<SkillModel> getSkills()
	{
		return skillrepo.findAll();
	}
}