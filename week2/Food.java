package com.hackbulgaria.programming51.week2;

public class Food {
	
	String name;
	String type;
	int weight;
	
	public Food(String name, String type, int weight) {
		this.name = name;
		this.weight = weight;
		this.type = type;
	}
	
	public String toString() {
		return name + " - " + type + ": " + weight + "gramps"; 
	}
}
