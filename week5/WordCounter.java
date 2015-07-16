package com.hackbulgaria.programming51.week5;

import java.util.Scanner;

public class WordCounter {

	public static int found(String str, char[][] map) {
		int result = countWord(str, map);
		String revStr = new StringBuilder(str).reverse().toString();
		if (!str.equals(revStr))
			result += countWord(revStr, map);
		return result;
	}

	private static int countWord(String s, char[][] m) {
		int result = 0;
		boolean temp = true;
		for (int i = 0; i < m.length; i++) { // rows
			for (int j = 0; j < m[i].length; j++) { // columns
				if (s.charAt(0) != m[i][j])
					continue;
				// checking row
				if (j + s.length() <= m[i].length) {
					for (int k = 1; k < s.length(); k++) {
						if (s.charAt(k) != m[i][j + k]) {
							temp = false;
							break;
						}
					}
					if (temp == true) {
						result += 1;
					} else {
						temp = true;
					}
				}
				// checking column
				if (i + s.length() <= m.length) {
					for (int k = 1; k < s.length(); k++) {
						if (s.charAt(k) != m[i + k][j]) {
							temp = false;
							break;
						}
					}
					if (temp == true) {
						result += 1;
					} else {
						temp = true;
					}
				}

				// checking diagonals
				if ((j + s.length() <= m[i].length)
						&& (i + s.length() <= m.length)) {
					for (int k = 1; k < s.length(); k++) {
						if (s.charAt(k) != m[i + k][j + k]) {
							temp = false;
							break;
						}
					}
					if (temp == true) {
						result += 1;
					} else {
						temp = true;
					}
				}
				if ((j - s.length() >= 0) && (i + s.length() <= m.length)) {
					for (int k = 1; k < s.length(); k++) {
						if (s.charAt(k) != m[i + k][j - k]) {
							temp = false;
							break;
						}
					}
					if (temp == true) {
						result += 1;
					} else {
						temp = true;
					}
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searched = scanner.next();
        char [][] map;
        int n,m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        map = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = scanner.next().charAt(0);
            }
        }

        System.out.println(WordCounter.found(searched, map));
    }

}
