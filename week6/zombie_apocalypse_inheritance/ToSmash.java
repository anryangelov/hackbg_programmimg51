package com.hackbulgaria.programming51.week6.zombie_apocalypse_inheritance;

public class ToSmash extends Weapon{
	
	{ super.type = "TO_SMASH";}
	
	public int getDamage() {
		if (currentDurability < durability/2 && currentDurability != 1) {
			damage = damage -1;
		}
		currentDurability = currentDurability - 1;
		return damage;
	}

}
