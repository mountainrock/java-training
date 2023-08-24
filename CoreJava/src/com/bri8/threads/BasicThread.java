package com.bri8.threads;



class MyThread extends Thread {
	@Override
    public void run() {
       System.out.println("I am a thread : "+getName()+" . i run independently ");
    }
}


public class BasicThread {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("Current thread name : "+ currentThreadName);
		
		MyThread thread = new MyThread();
		thread.setName("worker 1");
		thread.start(); // Start the thread
		
		MyThread thread2 = new MyThread();
		thread2.setName("worker 2");
		thread2.start(); 
		

	}

}
