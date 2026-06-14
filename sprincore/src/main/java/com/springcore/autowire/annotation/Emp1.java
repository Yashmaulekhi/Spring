package com.springcore.autowire.annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class Emp1 {
   @Autowired
   //also can be used uooer constructor and setter method
   @Qualifier("temp2")
   private Address address;
   
   public Address getAddress() {
	return address;
   }
   public void setAddress(Address address) {
	this.address = address;
   }
   
   
   @Override
public String toString() {
	return "Emp [address=" + address + "]";
}
   public Emp1(Address address) {
	super();
	this.address = address;
	System.out.println("Constructor call");
}
   public Emp1() {
	super();
	// TODO Auto-generated constructor stub
   }
}
