package com.hackbulgaria.programming51.week7.priority_queue;

import java.util.LinkedList;

public class PQueue implements PriorityQueue {

    LinkedList<Integer> data = new LinkedList<>();
	
	public int pop() {
		int res = data.getLast();
		data.removeLast();
		return res;
	}

	public int peek() {
	   return data.peekLast();
	}

	public boolean isEmpty() {
	   return data.isEmpty(); 
	}

	public void push(int data) {
		int index = 0;
		for (int e: this.data) {
			index++;
			if (data < e) {
				this.data.add(index - 1, data);
				return;
			}
		}
		this.data.add(data);
	}
	
	public String toString(){
		return data.toString();
	}
	
	//test
	 public static void main(String[] args) {
		
	        PriorityQueue queue = new PQueue();
	        queue.push(60);
	        queue.push(75);
	        queue.push(85);
	        queue.push(50);
	        queue.push(56);
	        // System.out.println(queue);
	        // System.out.println(queue.peek());

	        System.out.println(queue.pop()); // 85
	        System.out.println(queue.pop()); // 75
	        System.out.println(queue.pop()); // 60
	    }

}
