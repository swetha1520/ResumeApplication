package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.InterestModel;
import com.example.springboot.service.InterestService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class InterestController {

	@Autowired
	private InterestService interestservice;
	
	@GetMapping("/interests")
	public List<InterestModel> getInterests()
	{
		return interestservice.getInterests();
	}
}
