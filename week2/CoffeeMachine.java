package com.hackbulgaria.programming51.week2;

public class CoffeeMachine {
	
	public Coffee[] brandsOfCoffee = new Coffee[10];
	public float balance = 0f;
	
	public CoffeeMachine() {}
	
	public boolean addCoffee(Coffee coffee) {
		if (brandsOfCoffee[9] != null) return false;
		for (int i = 0; i < 10; i++) {
			if (brandsOfCoffee[i] == null) {
				brandsOfCoffee[i] = coffee;
				return true;
			} else if (brandsOfCoffee[i].brand.equals(coffee.brand)) return true; // machine already has this brand 
		}
		return false;			
	}
	
	public float buyCoffee(String name, float price) {
		Coffee coffee;
		float change = 0;
		for (int i = 0; i < 10; i++) {
			if (brandsOfCoffee[i] == null) break; 
			coffee = brandsOfCoffee[i];
			if (coffee.brand.equals(name)) {
				if (coffee.price <= price) { // has enough money for wanted brand
					change = price - coffee.price;
					balance += change;
					return change;
				} 
			}
		}
		return -1;
	}
	
	public String toString() {
		String res = ""; 
		Coffee coffee;
		for (int i = 0; i < 10; i++) {
			if (brandsOfCoffee[i] == null) {
				break;
			} else {
				coffee = brandsOfCoffee[i];
				res += i + 1 + "." + coffee.brand + " "; 
			}
		}
		return res + "  " + "balance: " + balance;
	}
}
