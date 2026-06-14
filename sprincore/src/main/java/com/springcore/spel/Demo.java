package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("d1")
public class Demo {
@Value("#{22+2}")   
private int x;
@Value("#{42+2}")   
private int y;
@Value("#{T(java.lang.Math).sqrt(25)}")//static method
private double z;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Value("#{T(java.lang.Math).E}")//statc variable
private double e;
@Value("#{new java.lang.String('Durgesh Tiwari')}")
private String name;

@Value("#{40>3}")
private boolean a;
public boolean isA() {
	return a;
}
public void setA(boolean a) {
	this.a = a;
}
public double getE() {
	return e;
}
public void setE(double e) {
	this.e = e;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}


public double getZ() {
	return z;
}

@Override
public String toString() {
	return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", a=" + a + "]";
}


public void setZ(double z) {
	this.z = z;
}
public void setY(int y) {
	this.y = y;
}
}