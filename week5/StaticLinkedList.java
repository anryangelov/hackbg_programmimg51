package com.hackbulgaria.programming51.week5;

public class StaticLinkedList {

	public static LinkedList<Integer> reverse(LinkedList<Integer> l) {
		// Reverses the list
		LinkedList<Integer> res = new LinkedList<Integer>();
		for (int i = 0; i < l.size(); i++) {
			res.add(l.get(l.size() - i - 1));
		}
		return res;
	}

	public static LinkedList<Integer> sort(LinkedList<Integer> l) {
		// Sorts the list
		LinkedList<Integer> res = l;
		for (int i = 0; i < res.size(); i++) {
			int temp = i;
			for (int j = i; j < res.size(); j++) {
				if (res.get(temp) < res.get(j)) {
					temp = j;
				}
			
			}
			int value = res.get(i);
			res.set(i, res.get(temp));
			res.set(temp, value);
		}
		return res;
	}

	public static LinkedList<Integer> merge(LinkedList<Integer> a,
			LinkedList<Integer> b) {
		// Merges a and b into one sorted list
		LinkedList<Integer> res = a;
		for (int i = 0; i < b.size(); i++ ) {
			res.add(b.get(i));
		}
		return sort(res);
	}
	
}
