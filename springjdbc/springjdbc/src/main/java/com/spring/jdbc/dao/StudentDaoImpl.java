package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;
@Component
public class StudentDaoImpl implements StudentDao {
	@Autowired
    private JdbcTemplate jdbcTemplate;
    public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO student (id, name, city) VALUES (?, ?, ?)";
		int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	@Override
	public int change(Student student) {
		//update data
		String query="Update student set name=? ,city=? where id=?";
		int y=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return y;
	}
	@Override
	public int delete(int studentId) {
		//delete
		String query="Delete from student where id=?";
		int a=this.jdbcTemplate.update(query,studentId);
		return a;
	}
	@Override
	public Student getStudent(int studentId) {
		String query="select * from student where id=?";
		RowMapper<Student> rowMapper=new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);

		return student;
	}
	@Override
	public List<Student> getAllStudent() {
		// select multiple student
		String query="select * from student ";
		
		List<Student> students= this.jdbcTemplate.query(query,new RowMapperImpl());
		
		return students;
		}

	}

	
	