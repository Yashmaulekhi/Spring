package com.springcore.stereotype;



import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")//if you have to change variable name of application context by default lowercase of this class
@Scope("prototype")
public class Student {
	@Value("Yash")
  public String studentname;
	@Value("Delhi")
  public String city;
	
  private List<String> address;
  public List<String> getAddress() {
	return address;
}
  public void setAddress(List<String> address) {
	this.address = address;
  }
  @Override
public String toString() {
	return "Student [studentname=" + studentname + ", city=" + city + "]";
}
  public String getCity() {
	return city;
  }
  public void setCity(String city) {
	this.city = city;
  }
}
