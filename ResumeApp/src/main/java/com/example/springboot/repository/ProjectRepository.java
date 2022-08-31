package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.model.ProjectModel;


public interface ProjectRepository extends JpaRepository<ProjectModel,Integer> {

}