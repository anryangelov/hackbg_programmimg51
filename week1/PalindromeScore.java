package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class PalindromeScore {

	private static int reversedNum (int x) {
		int res = 0;
		while (x > 0) {
			res = res * 10 + (x % 10);
			x = x / 10;
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		int res = 0; 
			
		while ( true ) {
			int rev_a = reversedNum(a);
			if (rev_a == a) {
				res++;
				break;
			} else {
				a = a + rev_a;
				res++;		
			}			
		}
		System.out.println(res);
	}

}
