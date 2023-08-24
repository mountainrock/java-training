package com.bri8.queue;

import java.util.*;

public class QueueExample {
	public static void main(String[] args) {
		// Queue example
		Queue<String> queue = new LinkedList<>(); //FIFO
		queue.add("First");
		queue.add("Second");
		System.out.println("Queue poll() : " + queue.poll());
		System.out.println("Queue peek() : " + queue.peek()); //doesnt remove the object
		System.out.println("Queue size() : " + queue.size());
		
		System.gc();
		
	
	}
}


class Node{
	
}