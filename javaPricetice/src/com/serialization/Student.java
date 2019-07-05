package com.serialization;

import java.io.Serializable;

public class Student implements Serializable {
	
	 int id;
	 String name;
	 int age ;
	 
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 
	 

}
