package com.hackbulgaria.programming51.week2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CoffeeMachine cm = new CoffeeMachine();
		Coffee Lavazza = new Coffee("Lavazza", 5);
		Coffee Illy = new Coffee("Illy", 4);
		
		String name;
		Coffee coffee;
		for (int i = 0; i < 8; i++) {
			name = "coffee" + (i + 1);
			coffee = new Coffee(name, i+1);
			cm.addCoffee(coffee);
			
		}
		
		cm.addCoffee(Lavazza);
		
		System.out.println("chnage: " + cm.buyCoffee("Lavazza", 8f));
		System.out.println(cm);
		System.out.println();
		
		cm.addCoffee(Illy);
		
		System.out.println("change:" + cm.buyCoffee("Lavazza", 4f));	
		System.out.println(cm);
	}

}
