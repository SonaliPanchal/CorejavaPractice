package com.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Car implements Externalizable{
	
	static int age; 
    String name; 
    int year;
    
    public Car()
    {
    	System.out.println("default constructor call");
    }
    
    
    
	public static int getAge() {
		return age;
	}



	public static void setAge(int age) {
		Car.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException 
	{
		out.writeObject(name);
		out.write(age);
		out.write(year);
		
	} 
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		age = in.readInt();
		year = in.readInt();
		
	}
	public String tosString()
	{
		return ("Name :" +name+ "Age :" +age+ "Year" +year);
		
	}
	
	

}
