package com.hackbulgaria.programming51.week2;


public class Fridge {

	public int capacity;
	private Food foods [];
	private int maxWeight;
	private int numFoods;
	private int weight;
	
	public Fridge(int capacity) {
		foods = new Food[capacity];
		this.capacity = capacity;
		weight = 0;
		numFoods = 0;
	}
	
	public String toString() {
		String res = "";
		for ( Food food: foods ) {
			if (food == null) continue;
			res += food + "\n";
		}
		return res;			
	}
	
	
	public int getFoodCount() {
		return numFoods;
	}
	
	public boolean addFood(Food f) {
		for (int i = 0; i < numFoods; i++) {
			if (foods[i].name.equals(f.name)) {
				foods[i].weight += f.weight;
				weight += f.weight;
				return true;
			}
		}
		if (numFoods >= capacity) return false;
		foods[numFoods] = f;
		weight += f.weight;
		numFoods++;
		return true;
	}
	
	public int countType(String type) {
		int counter = 0;
		for (Food temp: foods) {
			if (temp == null) continue;
			if (temp.type.equals(type)) {
				counter++;
			}
		}
		return counter;
	}
	
	public Food [] getProdyctsOfType(String type) {
		Food [] temp = new Food[countType(type)];
		int index = 0; 
		for (Food food: foods) {
			if (food == null) continue;
			if (food.type.equals(type)) {
				temp[index] = food;
				index++;
			}
		}
		return temp;
	}
	
	public Food getHeaviestFood() { 
		Food heaviestFood = foods[0];
		for (Food temp: foods) {
			if (temp == null) continue;
			if (temp.weight > heaviestFood.weight) {
				heaviestFood = temp;
			}
		}
		return heaviestFood;
	}
	
	public int getWeight() {
		return weight;		
	}

	public int getCapacity() {
		return capacity;
	}
	
	public int getMaxWeight() {
		return maxWeight;
	}
}




