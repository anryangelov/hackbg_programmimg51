package com.hackbulgaria.programming51.week4;

import java.util.Scanner;

public class MaxSpan {

	public static int maxSpan(int[] numbers) {
		int res = 0;
		for (int i = 0; i < numbers.length; i++) {
			int count = 0;
			for (int j = i; j < numbers.length; j++ ) {
				count += 1;
				if (numbers[i] == numbers[j] && res < count) res = count; 
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}

		System.out.println(maxSpan(numbers));
	}

}
