package com.infotech.client;

import com.infotech.working.MakingCounter;

public class ClientTeat {
public static void main(String[] args) {
	MakingCounter r = new MakingCounter();
	Thread t1 = new Thread(r);
	Thread t2 = new Thread(r);
	t1.start();
	t2.start();
	try {
		t1.join();
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Counter Final value "+r.getCounter());
}
}
