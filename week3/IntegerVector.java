package com.hackbulgaria.programming51.week3;

public class IntegerVector {

	private int[] data;
	private int capasity;
	private int size;

	public IntegerVector() {
		capasity = 10;
		data = new int[capasity];
		size = 0;
	}

	public String toString() {
		String res = "";
		for (int i = 0; i < size; i++) {
			res += data[i] + " ";
		}
		return res;
	}

	public void add(int e) {
		if (size >= capasity) {
			resize();
		}
		data[size] = e;
		size++;
	}

	private void resize() {
		capasity = capasity * 2 + 1;
		int[] temp = new int[capasity];
		for (int i = 0; i < size; i++) {
			temp[i] = data[i];
		}
		data = temp;
	}

	public int get(int index) {
		return data[index];
	}

	public int size() {
		return size;
	}

	public int sum() {
		int res = 0;
		for (int i = 0; i < size; i++) {
			res += data[i];
		}
		return res;
	}

	public void addAll(int[] n) {
		for (int i : n) {
			this.add(i);
		}
	}
	
	public void insert(int index, int data) {
		this.add(0); // some value just to extend the massive;
		for (int i = size - 1; i > index; i--) {
			this.data[i] = this.data[i-1];			
		}
		this.data[index] = data; 
	}
	
	public void replace(int index1, int index2) {
		int temp = data[index1];
		data[index1] = data[index2];
		data[index2] = temp;
	}

	public static void main(String[] args) {
		IntegerVector data = new IntegerVector();
		int len = 9;
		for (int i = 0; i < len; i++) {
			data.add(i);
		}
		System.out.println(data);
		System.out.println("size: " + data.size());
		System.out.println("sum: " + data.sum());
		int[] n = new int[2];
		for (int i = 0; i < n.length; i++) {
			n[i] = i;
		}
		data.addAll(n);
		System.out.println(data);
		data.insert(10, 100);
		System.out.println(data);
	}
}
