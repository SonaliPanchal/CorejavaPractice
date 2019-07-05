package com.infotech.client;

public class ClientTest {
public static void main(String[] args) {

	Thread t1 = new Thread(()->{//-> is enable runnable interface
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"::i-->"+i);
		}
	});

	Thread t2 = new Thread(()->{
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"::i-->"+i);
		}
	});
	
	t1.start();
	t2.start();
}
}
