package com.example.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.model.LanguageModel;


public interface LanguageRepository extends JpaRepository<LanguageModel,Integer>{

}