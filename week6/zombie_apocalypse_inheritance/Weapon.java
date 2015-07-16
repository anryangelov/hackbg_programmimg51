package com.hackbulgaria.programming51.week6.zombie_apocalypse_inheritance;

public class Weapon {
	
	protected int damage;
	protected int durability;
	protected int currentDurability;
	protected String type;
	
	public int getDamage() {
		return damage;
	}
	
	public int getDurability() {
		return currentDurability;
	}
	
	public String getType() {
		return type;
	}

}
