package com.infotech.client;

public class MyThread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <=5; i++) {
			System.out.println(Thread.currentThread().getId()+i);
			if(i==4) {
				throw new RuntimeException("My runtime exception");
			}
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
