package springcore.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="springcore.java.config")//bean lagane ke baadi sko hata sakte hai
public class JavaConfig {
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	@Bean(name= {"student","temp"})//agar configuration lene ke liye student ke alawa aur kuch use karu
	public Student getStudent() {
		Student student=new Student(getSamosa());
		return student;
	}

}
