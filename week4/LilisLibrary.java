package com.hackbulgaria.programming51.week4;

import java.util.Scanner;
import java.util.Vector;

public class LilisLibrary {

	public static Vector<Pair<String, Integer>> orderBooks(Vector<String> books) {
		Vector<Pair<String, Integer>> res = new Vector<Pair<String, Integer>>();
		books.sort(null);
		for (String book: books) {
			if (! updateIfHasBook(res, book)) {
				Pair<String, Integer> p = new Pair<String, Integer>();
				p.first = book;
				p.second = 1;
				res.add(p);
			}
		}
		return res;
	}
	
	public static boolean updateIfHasBook(Vector<Pair<String, Integer>> books, String book) {
		for (Pair<String, Integer> p: books) {
			if (p.first.equals(book)) {
				p.second += 1;
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Vector<String> books = new Vector<String>();
		int booksCount = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < booksCount; i++) {
			books.add(scanner.nextLine());
		}

		Vector<Pair<String, Integer>> result = orderBooks(books);

		for (Pair<String, Integer> titleCount : result) {
			System.out.println(titleCount.first + " : " + titleCount.second);
		}
	}

}
