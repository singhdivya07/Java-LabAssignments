package com.capgemini.lab4.inheritance;
public class Ex1Person {
private float age;
private String name;

public Ex1Person(float age, String name) {
	super();
	this.age = age;
	this.setName(name);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getAge() {
	return age;
}


}
