package com.hackbulgaria.programming51.week6;

public class Revolver implements Weapon{
	
	private int damage;
	private int durability;
	private int currentDurability;
	private String type;
	
	public Revolver() {
		damage = 15;
		durability = 6;
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
