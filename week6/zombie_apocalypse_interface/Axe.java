package com.hackbulgaria.programming51.week6.zombie_apocalypse_interface;


public class Axe implements Weapon {
	
	private int damage;
	private int durability;
	private int currentDurability;
	private String type;
	
	public Axe(){
		damage = 10;
		durability = 50;
		currentDurability = durability;
		type = "TO_SMASH";
	}
	
	public int getDamage() {
		if (currentDurability < durability/2 && currentDurability != 1) {
			damage = damage -1;
		}
		currentDurability = currentDurability - 1;
		return damage;
	}
	
	public int getDurability() {
		return currentDurability;
	}
	
	public String getType() {
		return type;
	}
	
}

