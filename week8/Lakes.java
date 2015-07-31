package com.hackbulgaria.programming51.week8;

import java.util.Scanner;

public class Lakes {

	public static void main(String[] args) {
		int result = 0;
		char l;
		int squares = 0;
		int water = 1000;
		Scanner scanner = new Scanner(System.in);
		String line = scanner.next();
		for (int i = 0; i < line.length(); i++) {
			l = line.charAt(i);
			if (l == 'd') {
				if (squares >= 0) result += squares * water + water / 2.0;
				squares++;
			} else if (l == 'u') {
				squares--;
				if (squares >= 0) result += squares * water + water / 2.0;
			} else if (l == 'h') {
				if (squares > 0) result += squares * water;
			}
		}
		System.out.println(result);
	}

}
