package com.infotech.client;

public class DefaultUncaughtExceptionhandler {

	public static void main(String[] args) {
		//register a default Uncaught exception handler for our programm
		Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				 //do some good stuff here ,like logging and sending alert 
				//email to the support team.
				System.out.println(t.getName()+"thread with the following exception");
				System.out.println(e.getMessage());
			}
		});
		
		Thread t1 = new Thread(new MyThread(),"T!");
		t1.start();
				
	}

}
