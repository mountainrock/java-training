package com.bri8.threads;

public class RunableExample {

	public static void main(String[] args) {
		Thread t = new Thread(new RunnableThread());
		t.start();

	}

}


class RunnableThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Runnable running");
		
	}
	
}