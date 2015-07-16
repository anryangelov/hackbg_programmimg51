package com.hackbulgaria.programming51.week6.zombie_apocalypse_interface;


public class AncientSword implements Weapon {
	
	private int damage;
	private int durability;
	private int currentDurability;
	private String type;
	
	public AncientSword() {
		damage = 50;
		durability = 10;
		currentDurability = durability;
		type = "TO_SMASH";
	}
	
	public int getDamage() {
		if ((currentDurability < durability/2) && (damage != 1)) {
			damage -= 1;
		}
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
