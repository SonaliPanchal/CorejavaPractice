package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialization 
{
	
	
	
public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	String fileName = "abc.txt";
	Student s1 = new Student();
	s1.setId(1);
	s1.setName("sonali");
	s1.setAge(25);
	//serialization
	
	FileOutputStream fout = new FileOutputStream(fileName);//Writing binary data into file
	ObjectOutputStream Out= new ObjectOutputStream(fout);//Converting java object state into binary formate.
	Out.writeObject(s1);
	Out.flush();
	Out.close();
	System.out.println(s1.getId()+" name :"+s1.getName()+" Age :"+s1.getAge());
	
	//Deserilization 
	
	FileInputStream fio = new FileInputStream(fileName);//Ready binary strem
	ObjectInputStream Oi = new ObjectInputStream(fio);//Conversion Binary stream into java ObjectState.
	Student s2 = (Student)Oi.readObject();
	Oi.close();
	System.out.println(s2.getId()+" name :"+s2.getName()+" Age :"+s2.getAge());
	
}
}
