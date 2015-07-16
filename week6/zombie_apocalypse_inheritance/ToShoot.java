package com.hackbulgaria.programming51.week6.zombie_apocalypse_inheritance;

public class ToShoot extends Weapon {

	{
		type = "TO_SHOOT";
	}

	public int getDamage() {
		if (currentDurability <= 0)
			return 1;
		currentDurability -= 1;
		return damage;
	}

}
