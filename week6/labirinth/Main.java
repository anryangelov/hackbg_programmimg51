package com.hackbulgaria.programming51.week6.labirinth;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] l = { { '#', '#', '#', '#', '#', '#', '#', '#' },
				       { '#', 'X', '.', '#', '.', '.', '.', '#' },
				       { '#', '.', '.', '.', '.', '#', '.', '#' },
				       { '#', '.', '.', '#', '.', '.', '.', '#' },
				       { '#', '#', '.', '.', '.', '.', '#', '#' },
				       { '#', '.', '.', '.', '#', '.', '.', '#' },
				       { '#', '#', '#', '#', '#', '#', '!', '#' } };
		
		Labirinth labirinth = new Labirinth(l);
		
		Scanner scaner = new Scanner(System.in);
		String direction;
		Movement movement;
		
		while (!labirinth.exitFound()) {
			System.out.println();
			labirinth.print();
			System.out.println("\nMake your move:");
			direction = scaner.next().toLowerCase();

			if (direction.equals("right")) {
				movement = new MoveRight();
			} else if (direction.equals("left")) {
				movement = new MoveLeft();
			} else if (direction.equals("down")) {
				movement = new MoveDown();
			} else if (direction.equals("up")) {
				movement = new MoveUp();
			} else {
				System.out.println("Unkown movement");
				continue;
			}
			
			if (!labirinth.movePerson(movement)) System.out.println("Not allowed movement");	
		}
		labirinth.print();
		System.out.println("\nCongratulations! You have escaped the labirinth.");
						
	}

}
