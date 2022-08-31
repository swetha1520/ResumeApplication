package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.model.SkillModel;


public interface SkillRepository extends JpaRepository<SkillModel,Integer> {

}