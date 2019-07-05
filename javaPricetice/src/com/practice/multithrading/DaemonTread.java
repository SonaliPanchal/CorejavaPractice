package com.practice.multithrading;

public class DaemonTread extends Thread
{
	
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("daemeon Thread is runnig");
		}
		else
		{
			System.out.println("user Thread is working");
		}
		
	}
public static void main(String[] args) {
	DaemonTread d1 = new DaemonTread();
	DaemonTread d2 = new DaemonTread();
	DaemonTread d3 = new DaemonTread();
	d1.setDaemon(true);
	d1.start();
	d2.start();
	d3.start();
	
	
}
}
