package com.hackbulgaria.programming51.week6.labirinth;

public class Pair<T> {
	private T first;
	private T second;

	public Pair(T first, T second) {
		this.setFirst(first);
		this.setSecond(second);
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public T getSecond() {
		return second;
	}

	public void setSecond(T second) {
		this.second = second;
	}

	public Pair<T> copy() {
		return new Pair<T>(first, second);
	}
	
	public boolean equals(Pair<T> p) {
		return p.first.equals(first) && p.second.equals(second);
	}
}
