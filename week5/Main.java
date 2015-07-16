package com.hackbulgaria.programming51.week5;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<>();
		LinkedList<Integer> l2 = new LinkedList<>();
		for (int i = 10; i < 20; i++) {
			l1.add(i);
		}
		for (int i = 200; i < 205; i++) {
			l2.add(i);
		}
		System.out.println(l1);
		System.out.println(l2);
		l1.insertListBefore(0, l2);
		l1.insertListAfter(0, l2);
		System.out.println(l1.size());
		System.out.println(l1.getFisrt());
		System.out.println(l1.getLast());
		System.out.println(l1);
		
	}
}
