package com.hackbulgaria.programming51.week8;

import java.util.Scanner;

public class FindThePanda {

	private char[][] maze;
	public int[] currentPosition = new int[2];
	private int[] pandaPosition;
	private char pandaSymbol = 'P';
	private char wallSymbol = '#';
	private char entrySymbol = 'U';
	private char pastSymbol = '!';
	private boolean found = false;

	public FindThePanda(char[][] maze) {
		this.maze = maze;
		currentPosition = findSymbolPosition(entrySymbol);
		pandaPosition = findSymbolPosition(pandaSymbol);
	}

	private int[] findSymbolPosition(char symbol) {
		int[] res = new int[2];
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[i].length; j++) {
				if (maze[i][j] == symbol) {
					res[0] = i;
					res[1] = j;
				}
			}
		}
		return res;
	}

	public String toString() {
		String res = "";
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[i].length; j++) {
				res += maze[i][j];
			}
			res += "\n";
		}
		return res;
	}

	private boolean isAllowed(int[] position) {
		if ((position[0] > maze.length - 1) || (position[0] < 0)) return false;
		if ((position[1] > maze[0].length - 1) || (position[1] < 0)) return false;
		if (maze[position[0]][position[1]] == wallSymbol) return false;
		if (maze[position[0]][position[1]] == pastSymbol) return false;
		return true;
	}

	private void putSymbol(int[] position, char Symbol) {
		maze[position[0]][position[1]] = Symbol;
	}

	private boolean findPanda() {
		return currentPosition[0] == pandaPosition[0]
				&& currentPosition[1] == pandaPosition[1];
	}

	public int[] Up(int[] position) {
		int[] newPosition = { position[0] - 1, position[1] };
		return newPosition;
	}

	public int[] Down(int[] position) {
		int[] newPosition = { position[0] + 1, position[1] };
		return newPosition;
	}

	public int[] Left(int[] position) {
		int[] newPosition = { position[0], position[1] - 1 };
		return newPosition;
	}

	public int[] Right(int[] position) {
		int[] newPosition = { position[0], position[1] + 1 };
		return newPosition;
	}

	public boolean isFound() {
		traverseRecursivly(currentPosition);
		return found;
	}

	public void traverseRecursivly(int[] position) {
		putSymbol(currentPosition, pastSymbol);
		currentPosition = position;
		putSymbol(position, entrySymbol);
		//System.out.println(this);
		//System.out.println();
		if (findPanda() || found) {
			found = true;
			return;
		}
		if (isAllowed(Up(position))) traverseRecursivly(Up(position));
		if (isAllowed(Left(position))) traverseRecursivly(Left(position));
		if (isAllowed(Down(position))) traverseRecursivly(Down(position));
		if (isAllowed(Right(position))) traverseRecursivly(Right(position));
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numRows = scanner.nextInt();
		int numColumns = scanner.nextInt();
		char[][] maze = new char[numRows][numColumns];

		String row;
		for (int i = 0; i < numRows; i++) {
			row = scanner.next();
			for (int j = 0; j < numColumns; j++) {
				maze[i][j] = row.charAt(j);
			}
		}

		FindThePanda M = new FindThePanda(maze);
		System.out.println(M.isFound());
	}

}
