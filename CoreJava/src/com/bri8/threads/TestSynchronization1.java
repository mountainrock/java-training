package com.bri8.threads;

class Table {
	synchronized void printTable(int n) {
		
		for (int i = 1; i <= 10; i++) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread1 extends Thread {
	Table t;

	MyThread1(Table t) {
		this.t = t;
		setName("5 multiplier thread : ");
	}

	public void run() {

		t.printTable(5);
	}

}

class MyThread2 extends Thread {
	Table t;

	MyThread2(Table t) {
		this.t = t;
		setName("9 multiplier thread : ");
	}

	public void run() {
		t.printTable(9);
	}
}

public class TestSynchronization1 {
	public static void main(String args[]) throws InterruptedException {
		Table tableObj = new Table();// only one object
		MyThread1 t1 = new MyThread1(tableObj);
		MyThread2 t2 = new MyThread2(tableObj);
		t1.start();
		
		t2.start();
		System.out.println("Main thread exited");
	}
}