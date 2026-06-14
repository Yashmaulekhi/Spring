package com.spring.orm.springorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.springorm.dao.StudentDao;
import com.spring.orm.springorm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

//        Student student = new Student(2324,"Durgesh Tiwari","Lucknow");
//        int r = studentDao.insert(student);
//
//        System.out.println("done " + r);
        while(true) {
        	
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("PRESS 1 for add student");
        System.out.println("PRESS 2 for dispaly all student");
        System.out.println("PRESS 3 for get detail of a single student");
        System.out.println("PRESS 4 for delete student");
        System.out.println("PRESS 5 for update student");
        System.out.println("PRESS 6 for exit");
        try {
        	int input=Integer.parseInt(br.readLine());
        	switch(input) {
        	case 1:
        		//save student
        		System.out.println("Enter user id : ");
        		int uId=Integer.parseInt(br.readLine());
        		System.out.println("Enter user name : ");
        		String uName=br.readLine();
        		System.out.println("Enter user city : ");
        		String uCity=br.readLine();
        		Student s= new Student();
        		s.setStudentid(uId);
        		s.setStudentName(uName);
        		s.setStudentCity(uCity);
        		int r=studentDao.insert(s);
        		System.out.println(r+" id of student added");
        		System.out.println("*****************************************");
        		break;
        		
        	case 2:
        		List<Student> allStudent=studentDao.getAllStudents();
        		for(Student s1:allStudent) {
        			System.out.println("Id : "+s1.getStudentid());
        			System.out.println("Name : "+s1.getStudentName());
        			System.out.println("City : "+s1.getStudentCity());
        			System.out.println("**********************");
        		}
        		break;
        	case 3:
        		break;
        	case 4:
        		break;
        	case 5:
        		break;
        	case 6:
        		 System.out.println("Exiting...");
        	        System.exit(0);
        		break;
        		
        	}
        }catch(Exception e) {
        	System.out.println("Invalid input try with another Type");
        	System.out.println(e.getMessage());
        }
    }}}

