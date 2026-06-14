package com.springcore.sptereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
//       
       // Demo d1 =con.getBean("demo",Demo.class);
        
        
        System.out.println(d1);
       
	}

}
