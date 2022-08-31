package com.example.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.model.LanguageModel;
import com.example.springboot.repository.LanguageRepository;

@Service
public class LanguageService {

	@Autowired
	private LanguageRepository langrepo;
	
	public List<LanguageModel> getLanguages()
	{
		return langrepo.findAll();
	}
}
