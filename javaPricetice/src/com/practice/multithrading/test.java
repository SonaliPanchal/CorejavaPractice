package com.practice.multithrading;

class test
{
	public static void main(String[] args) {
		Mutipletask t1 = new Mutipletask();
		Simple2 t2 = new Simple2();
		t1.start();
		t2.start();
	}
}