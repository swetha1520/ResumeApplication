package com.example.springboot.model;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "technicalskills")
public class SkillModel {

	@Id
	@GeneratedValue
	private int skill_id;
	private String skill;
	
	public int getSkill_id() {
		return skill_id;
	}
	public void setSkill_id(int skill_id) {
		this.skill_id = skill_id;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public void addAttribute(String string, List<SkillModel> skills) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
