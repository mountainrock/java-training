package com.bri8.queue;

import java.util.*;

public class QueueExampleMultiThreaded {
	public static void main(String[] args) {
		// Queue example
		Queue<String> queue = new LinkedList<>(); // FIFO
		
		new ProducerThread(queue).start();
		new BookingCounterThread(queue).start();

	}
}

class BookingCounterThread extends Thread {
	Queue<String> queueInternal;

	BookingCounterThread(Queue<String> queue) {
		this.queueInternal = queue;
	}

	@Override
	public void run() {
		while (true) {
			String obj = queueInternal.poll();
			System.out.println(obj);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

class ProducerThread extends Thread {
	Queue<String> queueInternal;

	ProducerThread(Queue<String> queue) {
		this.queueInternal = queue;
	}

	@Override
	public void run() {
		while (true) {
			String objName = "First" + System.currentTimeMillis();
			this.queueInternal.add(objName);
			System.out.println("Added " + objName);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
