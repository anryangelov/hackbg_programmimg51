package com.hackbulgaria.programming51.project.trie;

public class Node {

	public Node [] path;
	public String value;
	
	public Node() {
		path = new Node[26];
		value = null;
	}
	
	public Node(String value) {
		this.value = value;
		path = new Node[26];
	}
	
}
