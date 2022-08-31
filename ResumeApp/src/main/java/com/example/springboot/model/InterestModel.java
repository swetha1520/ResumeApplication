package com.example.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "interests")
public class InterestModel {

	@Id
	@GeneratedValue
	private int interest_id;
	private String interest;
	public int getInterest_id() {
		return interest_id;
	}
	public void setInterest_id(int interest_id) {
		this.interest_id = interest_id;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	
	
}
