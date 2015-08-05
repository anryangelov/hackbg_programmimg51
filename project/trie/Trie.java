package com.hackbulgaria.programming51.project.trie;

public class Trie {
	
	public Node top;
	private String stringResult;
	
	public Trie() {
		top = new Node();
	}
	
	public String toString() {
		stringResult = "";
		traverseRecursivly(top);
		return stringResult;
	}
	
	private void traverseRecursivly(Node node) {
		String letter;
		if (node.value != null) stringResult += "--> " + "( " + node.value + " ) ";
		for (int i = 0; i < node.path.length; i++) {
			if (node.path[i] != null ) {
				 letter = Character.toString((char) (i + 97));
				 stringResult += letter + " ";
				 //if (node.path[i].value != null) res += "--> " + node.path[i].value + "\n" + res.replace("[a-z]", " ");
				 traverseRecursivly(node.path[i]);
			}
		}
	}
	
	public void add(String key, String value) {
		addRecursivly(key, value, top);
	}
	
	private void addRecursivly(String key, String value, Node node) {
		if (key.length() == 0) { 
			node.value = value;
			return;
		}
		Node nextNode;
		int ascii_int = key.charAt(0) - 97;
		key = key.substring(1, key.length());
		if (node.path[ascii_int] == null ) {
			nextNode = new Node();
			node.path[ascii_int] = nextNode;
		} else {
			nextNode = node.path[ascii_int];
		}
		addRecursivly(key, value, nextNode);
	}
	
	public String get(String key) {
		Node node = getRrecursivly(key, top);
		if (node!= null) return node.value;
		return null;
	}
	
	private Node getRrecursivly(String key, Node node) {
		if (key.length() == 0) return node;
		int ascii_int = key.charAt(0) - 97;
		key = key.substring(1, key.length());
		if (node.path[ascii_int] != null) {
			return getRrecursivly(key, node.path[ascii_int]);
		}
		return null;
	}
	
	public boolean delete(String key) {
		Node node = getRrecursivly(key, top);
		if (node != null) {
			node.value = null;
			return true;
		}
		return false;
	}
	
	
	
	

}
