package com.example.springboot.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "education")
public class EducationModel {

	@Id
	@GeneratedValue
	private int id;
	private String certificate_degree_name;
	private String institute_university_name;
    private Date starting_date;
    private Date ending_date;
    private String course;
    private float percentage;
    private float cgpa;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCertificate_degree_name() {
		return certificate_degree_name;
	}
	public void setCertificate_degree_name(String certificate_degree_name) {
		this.certificate_degree_name = certificate_degree_name;
	}
	public String getInstitute_university_name() {
		return institute_university_name;
	}
	public void setInstitute_university_name(String institute_university_name) {
		this.institute_university_name = institute_university_name;
	}
	public Date getStarting_date() {
		return starting_date;
	}
	public void setStarting_date(Date starting_date) {
		this.starting_date = starting_date;
	}
	public Date getEnding_date() {
		return ending_date;
	}
	public void setEnding_date(Date ending_date) {
		this.ending_date = ending_date;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
    
    
}

