package com.hackbulgaria.programming51.project.trie;

public class Main {

	public static void main(String[] args) {
		
		Trie data = new Trie();
		data.add("function", "find yourself");
		data.add("funny", "new meaning");
		data.add("abc", "meaning of abc");
		data.add("abzz", "meaning of abzz");
		System.out.println(data);
		System.out.println(data.get("abc"));
		System.out.println(data.get("abczz"));
		System.out.println(data.get("ab"));
		System.out.println(data.get("afdj"));
		System.out.println(data.get("funny"));
		System.out.println(data.delete("funny"));
		System.out.println(data.get("funny"));
		System.out.println(data.delete("opaopa"));
	}

}
