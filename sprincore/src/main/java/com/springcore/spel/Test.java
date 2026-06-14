package com.springcore.spel;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con =  new ClassPathXmlApplicationContext("com/springcore/spel/configuration.xml");
//       
        Demo d1 =con.getBean("d1",Demo.class);
        
        
        System.out.println(d1);
//        SpelExpressionParser temp =new SpelExpressionParser();
//        Expression expressio+
      //  n =temp.parseExpression("{22+33}");
//        System.out.println(expression.getValue());
//       
	}

}
