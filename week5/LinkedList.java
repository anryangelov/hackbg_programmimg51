package com.hackbulgaria.programming51.week5;

public class LinkedList<T> {
	
	   private Node<T> head;
	   private Node<T> tail;
	   private int size; 

	    public LinkedList(){
	        head = null;
	        tail = null;
	        size = 0;
	    }

	    public String toString() {
	    	if (head == null) return "";
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
	    	Node <T> temp = head;
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
	    	} else {
	    		tail.next = temp;
	    	}
	    	tail = temp;
	    	size += 1;
	    }
	    
	    public void addLast(T el){
	    	add(el);
	    }
	    
	    public void addFirts(T el){
	    	insert(0, el);
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
	    	size -= 1;
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
	    	size += 1;
	    }
	    
	    public int size() {
	    	return size;
	    }
	    
	    public T getFisrt() {
	    	return head.data;
	    }
	    
	    public T getLast() {
	    	return tail.data;
	    }
	    
	    public int getElementIndex(T data) {
	    	Node <T> temp = head;
	    	int count = 0;
	    	while (temp.next != null) {
	    		if (data.equals(temp.data)) return count;
	    		temp = temp.next;
	    		count += 1;
	    	}
	    	if (data.equals(temp.data)) return count;
	    	return -1;
	    }    
	    
	    public boolean contains(T data) {
	    	int index = getElementIndex(data);
	    	if (index == -1) return false;
	    	return true;
	    }
	    
	    public T[] toArray() {
	        // Returns an array with all the elements in the list
	    	T [] result =  (T []) new Object [size];
	    	if (size == 0) return result;
	    	Node <T> temp = head;
	    	int i = 0;
	    	while (temp.next != null) {
	    		result[i] = temp.data;
	    		temp = temp.next;
	    		i += 1;
	    	}
	    	result[i] = temp.data;
	    	return result;
	    }

	    public void addArray(T[] arr) {
	        // Appends the array at the end of the list
	    	for (int i = 0; i < arr.length; i++) {
	    		add(arr[i]);
	    	}
	    }
	    
	    public void clear() {
	    	head = null;
	    	tail = null;
	    	size = 0;
	    }
	    
	    private LinkedList<T> copy(LinkedList<T> l) {
	    	LinkedList<T> newL = new LinkedList<T>();
	    	if (head == null) return newL;
	    	Node <T> temp = l.head;
	    	while (temp.next != null) {
	    		newL.add(temp.data);
	    		temp = temp.next;
	    	}
	    	newL.add(temp.data);
	    	return newL;	
	    }

	    public void insertListAfter(int index, LinkedList<T> l) {
	        // Inserts all the elements of l after the index element
	    	l = copy(l);
	    	if (l.size == 0) return;
	    	if (size - 1 == index) {
	    		tail.next = l.head;
	    		tail = l.tail;
	    	} else {
	    		Node <T> node = getNode(index); 
	    		l.tail.next = node.next;
	    		node.next = l.head;
	    	}
	    	size += l.size;
	    }
	    public void insertListBefore(int index, LinkedList<T> l){
	        // Inserts all the elements of l before the index element
	    	l = copy(l);
	    	if (index == 0) {
	    		l.tail.next = head;
	    		head = l.head;
	    		size += l.size;
	    	} else {
	    		insertListAfter(index - 1, l);
	    	}
	    }
}
