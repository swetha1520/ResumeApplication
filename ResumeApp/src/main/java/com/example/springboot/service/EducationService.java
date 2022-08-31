package com.example.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.model.EducationModel;
import com.example.springboot.repository.EducationRepository;

@Service
public class EducationService {

	@Autowired
	private EducationRepository educationrepo;
	
	public List<EducationModel> getEduacationDetails()
	{
		return educationrepo.findAll();
	}
}