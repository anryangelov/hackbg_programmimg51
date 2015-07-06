package com.hackbulgaria.programming51.week4;

import java.util.Scanner;
import java.util.Vector;

public class Anagrams {

	public static boolean areAnagrams(String a, String b) {
		Vector<Character> aV = stringToVectorChar(a);
		Vector<Character> bV = stringToVectorChar(b);
		aV.sort(null);
		bV.sort(null);
		for (int i = 0; i < aV.size(); i++) {
			if ( ! (aV.get(i).equals(bV.get(i)))) return false;
		}
		if (! (aV.size() == bV.size())) return false;
		return true;
	}
	
	public static Vector<Character> stringToVectorChar(String c) {
		Vector<Character> res = new Vector<Character>();
		for (int i = 0; i < c.length(); i++ ) {
            char ch = c.charAt(i); 
			res.add(ch);
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String a = scanner.next();
		String b = scanner.next();

		if (areAnagrams(a, b)) {
			System.out.println("ANAGRAMS");
		} else {
			System.out.println("NOT ANAGRAMS");
		}
	}

}
