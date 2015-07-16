package com.hackbulgaria.programming51.week6.zombie_apocalypse_interface;


public class Shotgun implements Weapon {
	
	private int damage;
	private int durability;
	private int currentDurability;
	private String type;
	
	public Shotgun() {
		damage = 25;
		durability = 10;
		currentDurability = durability;
		type = "TO_SHOOT";
	}
	
	public int getDamage() {
		if (currentDurability <= 0) return 1;
		currentDurability -= 1;
		return damage;
	}
	
	public int getDurability() {
		return currentDurability;
	}
	
	public String getType() {
		return type;
	}

}
