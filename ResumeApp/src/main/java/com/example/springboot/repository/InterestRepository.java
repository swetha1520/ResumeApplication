package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.model.InterestModel;

public interface InterestRepository extends JpaRepository<InterestModel,Integer> {

}