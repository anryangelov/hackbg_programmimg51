package com.hackbulgaria.programming51.week2;

public class Auto {
	public Person owner;
	public int maxSpeed;
	public String brand;
	public String name;
	public int price;
	
	public Auto(Person owner, int maxSpeed, String brand, String name, int price) {
		this.owner = owner;
		this.maxSpeed = maxSpeed;
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return brand + " " + name + ", Max Speed: " + maxSpeed + ", Price: " + price + ", Owner: " + owner; 
	}
}
