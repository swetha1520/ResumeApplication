package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.UserModel;
import com.example.springboot.service.UserService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class UserController {

	@Autowired
	private UserService userservice;
	
	@GetMapping("/userDetails")
	public UserModel getUserDetails()
	{
		return userservice.getUserDetails();
	}
	
	@PutMapping("/editDetails")
	public void editUserDetails(@RequestBody UserModel user)
	{
		userservice.updateUser(user);
	}
}
