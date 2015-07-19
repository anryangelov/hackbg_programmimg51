package com.hackbulgaria.programming51.week6.labirinth;

public class MoveDown extends Movement{
	
	public Pair<Integer> move(Pair<Integer> currentPosition) {
        // System.out.println("Moving right!");
        // This is just an example! The math here depends on yout implementation.
		currentPosition = currentPosition.copy(); 
        currentPosition.setFirst(currentPosition.getFirst()+1);
        return currentPosition;
    }

}
