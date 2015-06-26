package com.hackbulgaria.programming51.week3;

public class TravelExpenseVector {

	private TravelExpense [] expences;
	private int capacity;
	private int size;
	
	public TravelExpenseVector() {
		capacity = 10;
		expences = new TravelExpense[10];
		size = 0;
	}
	
	public void Add(TravelExpense tr) {
		if (capacity == size) {
			resize();
			}	
			expences[size] = tr;
			size++;
	}
	
	private void resize() {
		capacity = capacity * 2 + 1;
		TravelExpense [] temp = new TravelExpense[capacity];
		for (int i = 0; i < size; i++) {
			temp[i] = expences[i];
		}
		expences = temp;
	}
	
	public int size () {
		return size;
	}
	
	public TravelExpense get(int i) {
		return expences[i];
	}
}
