package com.hackbulgaria.programming51.week6.zombie_apocalypse_inheritance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hits = 0;

		Scanner scanner = new Scanner(System.in);
		int numZombies = scanner.nextInt();
		int zombieHealth = scanner.nextInt();
		String w = scanner.next().toLowerCase();

		Weapon weapon;
		if (w.equals("axe")) {
			weapon = new Axe();
		} else if (w.equals("sword")) {
			weapon = new AncientSword();
		} else if (w.equals("shotgun")) {
			weapon = new Shotgun();
		} else {
			weapon = new Revolver();
		}

		for (int i = 0; i < numZombies; i++) {
			Zombie zombie = new Zombie(zombieHealth);
			while (!zombie.isDead()) {
				int d = weapon.getDamage();
				// System.out.println("damage: " + d);
				// System.out.println("durability: " + weapon.getDurability());
				zombie.hit(d);
				// System.out.println(zombie.getCurrentHealth());
				hits += 1;
			}
		}
		System.out.println(hits);
	}

}