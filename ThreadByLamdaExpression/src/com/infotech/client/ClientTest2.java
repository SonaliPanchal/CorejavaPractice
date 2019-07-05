package com.infotech.client;

public class ClientTest2 {
public static void main(String[] args) {
	Runnable r = ()->{
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"  I--->"+i);
		}
	};
	Runnable r1 = ()->{
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getPriority()+"  i--->"+i);
		}
	};
	Thread t1 = new Thread(r);
	Thread t2 = new Thread(r1);
 
	t1.start();
	t2.start();
}
}
