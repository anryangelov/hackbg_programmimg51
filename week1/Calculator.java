package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
	    int a = scanner.nextInt();
	    char oper = scanner.next().charAt(0);
	    int b = scanner.nextInt();

	    System.out.println(a);
	    System.out.println(oper);
	    System.out.println(b);
	    if (oper == '+') {
	    	System.out.println("result: " + (a + b));
	    } else if (oper == '^') {
	    	if (b == 0) {
	    		System.out.println("result: " + 1);
	    	}
	    	else {
	    		int c = a;
	    		for (int i = 1; i <= b - 1; i++ ) {
	    			a = a * c;
	    	}
	    	System.out.println("result: " + a);
	    	}
	    }
	    else if (oper == '?') {
	    	int c = a;
	    	while (a > 1) {
	    		c = c * (a - 1);
	    		a--;
	    	}
	    	int d = b;
	    	while (b > 1) {
	    		c = c * (b - 1);
	    		b--;
	    	}
	    	System.out.println("result: " + (c + d));
	    }
	    
	    else {
	    	System.out.println("Not a valid operator: " + oper);
	    }


	}

}
