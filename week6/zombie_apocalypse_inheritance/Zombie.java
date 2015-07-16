package com.hackbulgaria.programming51.week6.zombie_apocalypse_inheritance;

public class Zombie {
	
	private int totalHealth;
	private int currentHealth;
	
	public Zombie(int health) {
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
