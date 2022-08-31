package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.LanguageModel;
import com.example.springboot.service.LanguageService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class LanguageController {

	@Autowired
	private LanguageService langservice;
	
	@GetMapping("languages")
	public List<LanguageModel> getLanguages()
	{
	   return langservice.getLanguages();
	}
}
