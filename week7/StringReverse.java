package com.hackbulgaria.programming51.week7;

import java.util.Scanner;
import java.util.Stack;

public class StringReverse {

	private static Stack<Character> mystack = new Stack<Character>();

	public static String reverseStringWithStack(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			mystack.push(s.charAt(i));
		}
		while (!mystack.isEmpty()) {
			res += mystack.pop();
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();
		System.out.println(reverseStringWithStack(word));
	}
}
