package com.hackbulgaria.programming51.week2;

public class AutoShop {
	
	public Auto[] cars = new Auto[100];
	
	public void addCar(Auto car) {
		for (int i = 0; i < 100; i++ ) {
			if (cars[i] == null) {
				cars[i] = car;
				break;
			}
		}
	}
	
	public Auto getTopSpeed() {
		if (cars[0] == null) return null;
		Auto car = cars[0];
		for (int i = 1; i < 100; i++ ) {
			if (cars[i] == null) break;
			if (cars[i].maxSpeed > car.maxSpeed) {
				car = cars[i];
			}
		}
		return car;
	}
	
	public String toString() {
		String res = ""; 
		for (int i = 0; i < 100; i++) {
			if (cars[i] == null) break;
			res += cars[i] + "\n";
		}
		return res;
	}

}
