package com.infotech.working;

public class MakingCounter implements Runnable {

	private int counter;
	
	public void run() {
		for (int i = 0; i<1000; i++) {
			increaseCounter();
		}
		
	}
	private synchronized void increaseCounter() {
		counter++;
	}
	public int getCounter() {
		return counter;
	}

}
