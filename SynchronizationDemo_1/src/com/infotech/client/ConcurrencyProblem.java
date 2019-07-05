package com.infotech.client;
public class ConcurrencyProblem {
	static int arrray[]= {0};
	public static void main(String[] args) {
		final ConcurrencyProblem cp = new ConcurrencyProblem();
		Thread a = new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <=5; i++) {
					cp.increase();
				}			}
		}) ;
		Thread b = new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <=5; i++) {
					cp.decrease();
				}
			}
		});
		a.start();
		b.start();
		System.out.println("actual array result----->"+arrray[0]);
	}
	
	private synchronized void decrease() {
		arrray[0]--;
		System.out.println(arrray[0]-1);

	}
	protected synchronized void increase() {
		arrray[0]++;
System.out.println(arrray[0]+1);
	}
}
