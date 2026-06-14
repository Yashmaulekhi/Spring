package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.dao.StudentDao;

import com.spring.jdbc.entities.Student;

import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        System.out.println("My program started");

        ApplicationContext context =
                new AnnotationConfigApplicationContext(JdbcConfig.class);

        
                StudentDao studentDao=context.getBean(StudentDao.class);
//                Student student=new Student();
//                student.setId(555);
//                student.setName("Rajmit");
//                student.setCity("Mumbai");
//                int s=studentDao.change(student);
//                System.out.println("Data changed "+s);
                //for insert same bus 28 me insert method
                //delete
//                int b=studentDao.delete(555);
//                System.out.println("Delete "+b);
//                Student student=studentDao.getStudent(222);
//                System.out.println(student)
                List<Student> students=studentDao.getAllStudent();
                for(Student s: students) {
        			System.out.println(s);
              }}}
                
        
    
        