package com.hackbulgaria.programming51.week6.zombie_apocalypse_interface;


public class StandZombie implements Zombie {
	
	private int totalHealth;
	private int currentHealth;
	
	public StandZombie(int health) {
		totalHealth = currentHealth = health;
	}
	
	public int getTotalHealth() {
		return totalHealth;
	}
	
	public int getCurrentHealth() {
		return currentHealth;
	}
	
	public void hit(int damage) {
		currentHealth -= damage;
	}
	
	public boolean isDead() {
		return currentHealth <= 0;
	}

}
