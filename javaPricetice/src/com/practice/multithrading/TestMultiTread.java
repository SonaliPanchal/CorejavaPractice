package com.practice.multithrading;

public class TestMultiTread extends Thread{

	public void run()
	{
		int i=0;
		//System.out.println("runnig Thread "+Thread.currentThread().getPriority());
		if(Thread.currentThread().getName()=="sonali")
		{
			for(i=1;i<6;i++) {
			try {
					Thread.sleep(500);
				
				System.out.println(Thread.currentThread());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+"current Thread" +Thread.currentThread().getName());
		}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		TestMultiTread m1 = new TestMultiTread();
		TestMultiTread m2 = new TestMultiTread();


		m2.start(); 
		m1.start();
		m1.setPriority(Thread.MAX_PRIORITY);
		m2.setPriority(Thread.MIN_PRIORITY);
		m1.setName("sonali");
		m2.setName("sakshi");
		System.out.println(m1.getPriority());
	}

}
