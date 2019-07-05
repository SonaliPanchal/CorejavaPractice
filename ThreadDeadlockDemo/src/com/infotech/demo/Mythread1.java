package com.infotech.demo;

public class Mythread1 implements Runnable {
	private Object lock1;
	private Object lock2;
	
	

	public Mythread1(Object lock1, Object lock2) {
		super();
		this.lock1 = lock1;
		this.lock2 = lock2;
	}



	@Override
	public void run() {
		synchronized (lock1) {
			System.out.println(Thread.currentThread().getName()+"Locked resource 1 ");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (lock2) {
				System.out.println(Thread.currentThread().getName()+"Locked resource 2 ");
			}
		}

	}

}
