package com.example.springboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.model.EducationModel;


public interface EducationRepository extends JpaRepository<EducationModel,Integer>{

}
