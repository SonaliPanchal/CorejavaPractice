package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Car car = new Car();
		Car newCar = null;
		car.setName("BMW");
		car.setYear(2019);
		car.setAge(2);
		
		String file  = "xyz.txt";
		FileOutputStream fout = new FileOutputStream(file);
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		oout.writeObject(car);
		oout.flush();
		
		car.setName("BMW");
		car.setYear(2019);
		
		
		FileInputStream fio = new FileInputStream(file);
		ObjectInputStream oi = new ObjectInputStream(fio);
		newCar = (Car)oi.readObject();
		
		 System.out.println("The original car is:\n" + car); 
	        System.out.println("The new car is:\n" + newCar); 
	}
}
