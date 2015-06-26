package com.hackbulgaria.programming51.week2;

public class Coffee {
	
	public String brand = "";
	public float price = 0.0f;
	
	public String toString() {
		return brand + ": " + price;
	}
	
	public Coffee(String brand, float price) {
		
		this.brand = brand;
		this.price = price;
		
	}
	
}

