package com.example.springboot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.model.UserModel;
import com.example.springboot.repository.UserRepository;

@Service
public class UserService{

	@Autowired
	private UserRepository userrepo;
	
	
	
	public UserModel getUserDetails()
	{
		UserModel user=new UserModel();
		user.setUser_id(userrepo.findById(1).get().getUser_id());
		user.setUsername(userrepo.findById(1).get().getUsername());
		user.setEmail(userrepo.findById(1).get().getEmail());
		user.setMobile(userrepo.findById(1).get().getMobile());
		user.setAddress(userrepo.findById(1).get().getAddress());
		return user;
	}
	public void updateUser(UserModel user)
	{
		UserModel u=userrepo.findById(1).orElse(null);
		u.setEmail(user.getEmail());
		u.setMobile(user.getMobile());
		u.setAddress(user.getAddress());
		userrepo.save(u);
	}
	
}
