package com.infotech.collection.vector;

import java.util.Vector;

public class ClientTest {

	public static void main(String[] args) {
		Vector <Integer> intvector = new Vector();
		intvector.add(1);
		intvector.add(1);
		intvector.add(1);
		intvector.add(1);
		intvector.add(1);
		intvector.add(1);
		intvector.add(1);
		intvector.add(1);
		intvector.add(1);
		intvector.add(1);
		
		
		System.out.println(intvector.capacity());
		intvector.add(10,9);
		System.out.println(intvector.capacity());
	}
	
}
