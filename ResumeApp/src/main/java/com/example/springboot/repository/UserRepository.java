package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springboot.model.UserModel;



public interface UserRepository extends JpaRepository<UserModel,Integer>{

	@Query(value="select * from user where userName=?1",nativeQuery=true)
	UserModel getUserByName(String username);

}
