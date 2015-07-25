package com.hackbulgaria.programming51.week7;

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;

public class FunctionCallsWithOurFunctions {
	
	private Stack<String> mystack = new Stack<>();
	private ArrayList<String> names = new ArrayList<>();
	private ArrayList<String []> cont = new ArrayList<>();
	private int v;
	
	public void addFunction(String function) {
		String[] words = function.split(" ");
		names.add(words[0]);
		cont.add(words);
	}
	
	public void addNames(String names) {
		String [] functions = names.split(" . ");
		for (int i = 0; i < functions.length; i++) {
			// System.out.println(functions[i]);
			mystack.add(functions[i]);
		}
	}
	
	private boolean IsInnerFunction(String func) {
		String [] temp = func.split("\\)|\\(");
		boolean res = temp.length > 1 && findFunctionn(temp[0]) != null;
		return res;
	}
	
	private int calculateInnerFunction(String func, String arg, int val) {
		String [] temp = func.split("\\(|\\)");
		if (!temp[1].equals(arg)) val = Integer.parseInt(temp[1]); 
        int res = calculateFunction(findFunctionn(temp[0]), val);
        // System.out.println(func);
        // System.out.println(val);
        // System.out.println(res);
        return res;
	}
	
	private int calculateFunction(String [] function, int value) {
        int res = 0;
		String arg = function[1];
		if ( function[3].equals(arg)) {
			res = value;
		} else if (IsInnerFunction(function[3])) {
			res = calculateInnerFunction(function[3], arg, value);
			// System.out.println(res);
		}
		else {
			res = Integer.parseInt(function[3]); 
		}
		String operand = "+";
		int count = 0;
		int number = 0;
		for (int i = 4; i < function.length; i++) {
            count++;
			if (count == 1) { // get operand
					operand = function[i];
			}
			if (count == 2) { // get operator
				count = 0;
				if (IsInnerFunction(function[i])) {
					number = calculateInnerFunction(function[i], arg, value);
				} else if (function[i].equals(arg)) {
					number = value;
				} else {
					//System.out.println(function[i]);
					number = Integer.parseInt(function[i]);
				}
				if (operand.equals("+")) {
					res += number;
				} else if (operand.equals("-")) {
					res -= number;
				} else {
			
				}
			}
		}
		return res;
	}
	
	public void addValue(int value) {
		v = value;
	}
	
	private String [] findFunctionn(String n) {
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).equals(n)) {
				return cont.get(i);
			}
		}
		return null;
	}
	
	public int evaluate() {
		String name;
		int res = v;
		while (!mystack.isEmpty()) {
			name = mystack.pop();
			res = calculateFunction(findFunctionn(name), res);
		}
		return res;
	}
	
	public static void main (String [] args) {
		
		FunctionCallsWithOurFunctions f = new FunctionCallsWithOurFunctions();
		
		Scanner scanner = new Scanner(System.in);
		int numFunc = Integer.parseInt(scanner.nextLine());
		//System.out.println("numFunc :" + numFunc);
		for (int i = 0; i < numFunc; i++) {
			String function = scanner.nextLine();
			//System.out.println("funcs :" + function);
			f.addFunction(function);
		}
		String names = scanner.nextLine();
		//System.out.println("name :" + names);
		f.addNames(names);
		int val = scanner.nextInt();
		//System.out.println("val :" + val);
		f.addValue(val);
		System.out.println(f.evaluate());
		
	}
	
}
