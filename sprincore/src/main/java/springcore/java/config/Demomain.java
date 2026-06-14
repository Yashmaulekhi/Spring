package springcore.java.config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student=context.getBean("student",Student.class);
		System.out.println(student);
		student.study();
	}

}
