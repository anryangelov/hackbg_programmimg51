package com.hackbulgaria.programming51.week2;

public class MainAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person Ivan = new Person("Ivan", "Atanasov", 25);
		
		Auto audi = new Auto(Ivan, 200, "Audi", "Begachka", 2000);
		
		Auto peugeot = new Auto(null, 220, "Peugeot", "Dragster", 1000);
		
		AutoShop shop = new AutoShop();
		shop.addCar(audi);
		shop.addCar(peugeot);
		
		System.out.println(shop);
		
		System.out.println(shop.getTopSpeed());
		
	}

}
