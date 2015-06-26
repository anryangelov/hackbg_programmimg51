package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int c = a;
		int b = 0;
		while (a > 0) {
			b = b * 10 + (a % 10);
			a = a / 10;
		}
		int sum = c + b;
		
		int res = 0;
		int temp = sum;
		while (temp > 0) {
			res = res * 10 + (temp % 10);
			temp = temp / 10;
		}
		
		if (sum == res) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
