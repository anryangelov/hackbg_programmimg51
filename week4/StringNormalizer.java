package com.hackbulgaria.programming51.week4;

import java.util.Scanner;
import java.util.Vector;

public class StringNormalizer {

	public static String normalizeString(String str) {
		// TODO: implementation here
		Vector<String> res = new Vector<String>();
		String [] words = str.split("\\s+");
		for (String word: words) {
			if (word.length() != 0) {
				String s = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
				res.add(s);
			}
		}
		return String.join(" ", res);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine();

		System.out.println(normalizeString(s));
	}

}
