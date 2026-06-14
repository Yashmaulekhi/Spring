package com.spring.orm.springorm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.springorm.entities.Student;



public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//save the data in table and return the position where it inserted
	@Transactional
	public int insert(Student student) {
		Integer  i=(Integer)this.hibernateTemplate.save(student);
		return i;
	}
	//get single object or single data
	@Transactional
	public Student getStudent(int studentId) {
		Student student=this.hibernateTemplate.get(Student.class,studentId);
		return student;
	}
	//get all student
	@Transactional
	public List<Student> getAllStudents(){
		List <Student> students=this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	@Transactional
	public void deleteStudent(int studentId) {
		Student student=this.hibernateTemplate.get(Student.class, studentId);
				this.hibernateTemplate.delete(student);
	}
	@Transactional
	public void updateStudent(Student student) {
		
				this.hibernateTemplate.update(student);
	}
	}

