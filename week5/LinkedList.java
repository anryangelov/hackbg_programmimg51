package com.hackbulgaria.programming51.week5;

public class LinkedList<T> {
	
	   private Node<T> head;
	   private Node<T> tail;

	    public LinkedList(){
	        head = null;
	        tail = null;
	    }

	    public String toString() {
	    	String res = "";
	    	Node <T> temp;
	    	temp = head;
	    	while (temp.next != null) {
	    		res += temp.data + ", ";
	    		temp = temp.next;
	    	}
	    	return res + temp.data;
	    }
	    
	    private Node<T> getNode(int index) {
	    	int count = 0;
	    	Node <T> temp;
	    	temp = head;
	    	while (true) {
	    		if (count == index) break;
	    		temp = temp.next;
	    		count++;
	    	}
	    	return temp;
	    }
	    
	    public void add(T el){
	        // Append an element to the end of the list
	    	Node <T> temp = new Node<>(el);
	    	if (head == null) {
	    		head = temp;
	    		tail = temp;
	    	} else {
	    		tail.next = temp;
	    		tail = temp;
	    	}
	    }

	    public T get(int index){
	        // Return the element at the index place
	        return getNode(index).data;
	    }

	    public void set(int index, T el){
	        // Set the value at the index place
	    	getNode(index).data = el;
	    	
	    }

	    public void remove(int index){
	        // Remove an element form the index place
	    	if (index == 0) {
	    		head = head.next;
	    		return;
	    	}
	    	Node <T> node = getNode(index - 1);
	    	if (node.next.next == null) tail = node;
	    	node.next = node.next.next;
	    }

	    public void insert(int index, T el){
	        // Insert an element on the index place
	    	Node <T> newNode = new Node<>(el);
	    	if (index == 0) {
	    		newNode.next = head;
	    		head = newNode;
	    		return;
	    	}
	    	Node <T> node = getNode(index - 1);
	    	if (node.next == null) tail = newNode;
	    	newNode.next = node.next;
	    	node.next = newNode;
	    }
	    

}
