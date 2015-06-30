package com.hackbulgaria.programming51.week4;

public class Vector<T> {
	
	private T [] data;
	private int capasity;
	private int size;

	public Vector() {
		capasity = 5;
		data = (T []) new Object [capasity];
		size = 0;
	}

	public String toString() {
		String res = "";
		if (size > 0) {
			for (int i = 0; i < size - 1; i++) {
				res += data[i] + "; ";
			}
			res +=data[size -1];
		}
		return res;
	}

	public void add(T e) {
		if (size >= capasity) {
			resize();
		}
		data[size] = e;
		size++;
	}

	private void resize() {
		capasity = capasity * 2 + 1;
		T [] temp = (T []) new Object[capasity];
		for (int i = 0; i < size; i++) {
			temp[i] = data[i];
		}
		data = temp;
	}

	public T get(int index) {
		return data[index];
	}

	public int size() {
		return size;
	}

	public void addAll(T [] n) {
		for (T i : n) {
			this.add(i);
		}
	}
	
	public void insert(int index, T data) {
		add(this.data[size - 1]); // some value just to extend the massive;
		for (int i = size - 1; i > index; i--) {
			this.data[i] = this.data[i-1];			
		}
		this.data[index] = data; 
	}
	
	public void remove(int index) {
		for (int i = index; i < size; i++) {
			data[i] = data[i+1];
		}
		size--;
	}
	
	public void replace(int index1, int index2) {
		T temp = data[index1];
		data[index1] = data[index2];
		data[index2] = temp;
	}
	
	public boolean hasElement(T e) {
		for (int i = 0; i < size; i++) {
			if (get(i).equals(e)) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Vector<Integer> data = new Vector();
		int len = 9;
		for (int i = 0; i < len; i++) {
			data.add(i);
		}
		System.out.println(data);
		System.out.println("size: " + data.size());
		Integer [] n = new Integer[2];
		for (int i = 0; i < n.length; i++) {
			n[i] = i;
		}
		data.addAll(n);
		System.out.println(data);
		data.insert(8, 100);
		System.out.println(data);
		data.remove(1);
		System.out.println(data);
		System.out.println(data.hasElement(1));
	}
}
