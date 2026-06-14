package com.springcore.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.autowire.annotation.Emp1;

import org.springframework.context.ApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowire/autocofig.xml");
        Emp1 emp1=context.getBean("emp1",Emp1.class);
        System.out.println(emp1);
	}

}
