package com.spring.orm.springorm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {
public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
@Id
@Column(name="student_id")
private int studentid;
@Column(name="student_name")
private String studentName;
@Column(name="student_city")
private String studentCity;
public Student(int studentid, String studentName, String studentCity) {
	super();
	this.studentid = studentid;
	this.studentName = studentName;
	this.studentCity = studentCity;
}
public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentCity() {
	return studentCity;
}
public void setStudentCity(String studentCity) {
	this.studentCity = studentCity;
}

}
