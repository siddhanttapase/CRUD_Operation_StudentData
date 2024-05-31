package com.sid.Student.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter

@NoArgsConstructor
@Table(name="StudentData")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Student Id")
	private long sId;
	
	@Column(name="Student Name")
	private String sName;
	
	@Column(name="Student Surname")
	private String sSurName;
	
	@Column(name="Student Standred")
	private int sStd;
	
	@Column(name="Student Faculty")
	private String sFaculty;
	
	@Column(name="Student Age")
	private int sAge;
	
	@Column(name="Student Address")
	private String sAddress;
	
	

}
