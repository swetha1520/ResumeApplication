package com.example.springboot.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "languages")
public class LanguageModel {

	@Id
	@GeneratedValue
	private int lang_id;
	private String language;
	
	public int getLang_id() {
		return lang_id;
	}
	public void setLang_id(int lang_id) {
		this.lang_id = lang_id;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
}

