package com.hackbulgaria.programming51.week7;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {
	
	private static String openers = "([{";
	private static String closers = ")]}";
	
	public static boolean match(char open, char close) {
		return openers.indexOf(open) == closers.indexOf(close);
	}

	public static boolean areCorrect(String brackets) {
		Stack<Character> mystack = new Stack<Character>();
		for (int i = 0; i < brackets.length(); i++) {			
			char temp = brackets.charAt(i);
			if (closers.indexOf(temp) != -1) { // close bracket
				if (mystack.isEmpty() || (!match(mystack.pop(), temp))) return false;
			} else {
				mystack.push(temp);
			}			
		}
		return mystack.isEmpty();
	}
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brackets = scanner.next();
        System.out.println(Brackets.areCorrect(brackets));
    }
	
}
