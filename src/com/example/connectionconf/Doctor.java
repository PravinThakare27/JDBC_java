package com.example.connectionconf;

public class Doctor {
	int doctorid;
	String name;
	String contact;
	String GraduationUniversity;
	public int getDoctorid() {
		return doctorid;
	}
	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getGraduationUniversity() {
		return GraduationUniversity;
	}
	public void setGraduationUniversity(String graduationUniversity) {
		GraduationUniversity = graduationUniversity;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(int doctorid, String name, String contact, String graduationUniversity) {
		super();
		this.doctorid = doctorid;
		this.name = name;
		this.contact = contact;
		GraduationUniversity = graduationUniversity;
	}
	
}
