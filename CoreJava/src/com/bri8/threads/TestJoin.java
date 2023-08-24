package com.bri8.threads;


public class TestJoin {
	public static void main(String args[]) throws InterruptedException {
		Table tableObj = new Table();// only one object
		MyThread1 t1 = new MyThread1(tableObj);
		MyThread2 t2 = new MyThread2(tableObj);
		t1.start();
		
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Main thread exited");
	}
}