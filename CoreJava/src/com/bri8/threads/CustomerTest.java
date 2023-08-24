package com.bri8.threads;

class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " going to withdraw...");
		
		if (this.amount < amount) {
			
			System.out.println(name + " Less balance; waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println(name + " withdraw completed...");
	}

	synchronized void deposit(int amount) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " going to deposit...");
		this.amount += amount;
		System.out.println(name + " deposit completed... ");
		notify();
	}
}

public class CustomerTest {
	public static void main(String args[]) {
		final Customer c = new Customer();
		
		new Thread("WithdrawerThread") {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		
		new Thread("DepositorThread") {
			public void run() {
				c.deposit(10000);
			}
		}.start();

	}
}
