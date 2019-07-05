package com.infotech.working;

public class MakingCounter implements Runnable {

	private static int counter;
	
	public void run() {
		for (int i = 0; i<10; i++) {
			increaseCounter();
		}
		
	}
	private static synchronized void increaseCounter() {
		String tname = Thread.currentThread().getName();
		System.out.println(tname);
		counter++;
	}
	private static synchronized void jkk() {
		String tname = Thread.currentThread().getName();
		System.out.println("hello"+tname);
		counter++;
	}
	public int getCounter() {
		return counter;
	}

}
