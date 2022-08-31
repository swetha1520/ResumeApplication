package com.example.springboot.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.model.InterestModel;
import com.example.springboot.repository.InterestRepository;



@Service
public class InterestService {

	@Autowired
	private InterestRepository interestrepo;
	
	public List<InterestModel> getInterests()
	{
		return interestrepo.findAll();
	}
}
