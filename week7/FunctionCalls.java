package com.hackbulgaria.programming51.week7;

import java.util.Scanner;
import java.util.Stack;

public class FunctionCalls {
	
	private static Stack<String>mystack = new Stack<String>();

	public static int f1(int x) {
		return f2(x) + f3(x);
	}
	
	public static int f2(int x) {
		return 2 * x;
	}
	
	public static int f3(int x) {
		return x + 1;
	}
	
	public static int f4(int x) {
		return 2 * f1(x); 
	}
	
	public static int evaluate(String formula, int x) {		
		for (String s: formula.split(" . ")) {
			mystack.push(s);
		}		
		while (!mystack.isEmpty()) {
			String pop = mystack.pop();
			if (pop.equals("f1")) {
				x = f1(x);
			}
			else if (pop.equals("f2")) {
				x = f2(x);
			}
			else if (pop.equals("f3")) {
				x = f3(x);
			} else if (pop.equals("f4")) {
				x = f4(x);
			}
		}				
		return x;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		int x = scanner.nextInt();

		System.out.println(evaluate(input, x));

	}

}
