package com.hackbulgaria.programming51.week6.labirinth;

public class Labirinth {
	
	private char [][] labirinth;
	private Pair<Integer> currentPosition;
	private Pair<Integer> exit; 
	
	public Labirinth(char [][] l) {
		labirinth = l;
		currentPosition = findCharPostion('X');
		exit = findCharPostion('!');
	}
	
	private Pair<Integer> findCharPostion(char c) {
		for (int i = 0; i < labirinth.length; i++) {
			for (int j = 0; j < labirinth[i].length; j++) {
				if (labirinth[i][j] == c) {
					return new Pair<>(i, j);
				}
			}			
		}
		return null;
	}
	
	public String toString() {
		String res = "";
		for (int i = 0; i < labirinth.length; i++) {
			for (int j = 0; j < labirinth[i].length; j++) {
				res += labirinth[i][j];
				if (j != labirinth[i].length - 1) res += " ";
			}
			res += "\n";
		}
		return res;
	}
	
	public void print() {
		System.out.print(this);
	}
	
	public boolean movePerson(Movement move) {
		Pair<Integer> newPosion = move.move(currentPosition);
		if (labirinth[newPosion.getFirst()][newPosion.getSecond()] == '#') return false;
		labirinth[newPosion.getFirst()][newPosion.getSecond()] = 'X';
		labirinth[currentPosition.getFirst()][currentPosition.getSecond()] = '.';
		currentPosition = newPosion;
		return true;
	}
	
	public boolean exitFound() {
		return currentPosition.equals(exit);		
	}
}
