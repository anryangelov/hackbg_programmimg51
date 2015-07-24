package com.hackbulgaria.programming51.week7;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class PositivesAndNegatives {

	private static Stack<Integer> mystack = new Stack<Integer>();
	private static ArrayList<Integer> positive = new ArrayList<Integer>();
	private static ArrayList<Integer> negative = new ArrayList<Integer>();
	
	public static Stack<Integer> reorder(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				positive.add(numbers[i]);
			} else {
				negative.add(numbers[i]);
			}
		}
		positive.sort(null);
		negative.sort(null);
		for (int i: positive) {
			mystack.add(i);			
		}
		for (int i = 0; i < negative.size(); i++) {
		     mystack.add(negative.get(negative.size() - i -1));	
		}
		return mystack;
	  }
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int [] n = new int [count];
		for (int i = 0; i < count; i++) {
			n[i] += scanner.nextInt();
		}
		System.out.println();
		Stack<Integer> result = reorder(n); 

		while(!result.isEmpty()) {
		  System.out.println(result.pop());
		}
	}
   
}
