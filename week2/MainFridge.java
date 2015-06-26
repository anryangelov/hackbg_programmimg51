package com.hackbulgaria.programming51.week2;


public class MainFridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fridge F = new Fridge(10);
		
		for (int i = 1; i < 12; i++ ) {
			int w = i * 10;
			Food f = new Food("name" + i, "type" + i, w);		
			F.addFood(f);
		}
		System.out.println(F);
		System.out.println(F.getFoodCount());
		for (Food name: F.getProdyctsOfType("type2")) {
			System.out.println(name);
		}
		System.out.println(F.getWeight());
		System.out.println(F.getHeaviestFood());
		System.out.println(F.getCapacity());
		System.out.println(F.getMaxWeight());
	}

}
