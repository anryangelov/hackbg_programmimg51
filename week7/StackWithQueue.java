package com.hackbulgaria.programming51.week7;

import java.util.Queue;
import java.util.LinkedList;

public class StackWithQueue<T> {

	private Queue<T> firstQueue = new LinkedList<>();

	public T pop() {
		return firstQueue.poll();
	}

	public T peek() {
		return firstQueue.peek();
	}

	public boolean isEmpty() {
		return firstQueue.isEmpty();
	}

	public void push(T data) {
		firstQueue.add(data);
		for (int i = 1; i < firstQueue.size(); i++) {
			firstQueue.add(firstQueue.poll());
		}
	}

	// test
	public static void main(String[] args) {
		StackWithQueue<Integer> s = new StackWithQueue<Integer>();
		s.push(3);
		s.push(4);
		s.push(5);
		// System.out.println(s.peek());
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}

}
