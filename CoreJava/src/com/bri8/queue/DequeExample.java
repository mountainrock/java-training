package com.bri8.queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {

	public static void main(String[] args) {
		// Deque example
		Deque<String> deque = new LinkedList<>();
		deque.addFirst("First");
		deque.addLast("Last");
		System.out.println("Deque: " + deque.pollFirst());

	}

}
