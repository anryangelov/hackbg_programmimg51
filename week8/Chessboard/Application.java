package com.hackbulgaria.programming51.week8.Chessboard;

import javax.swing.JFrame;

public class Application extends JFrame {
	
	public Application() {
		super.add(new Canvas());
		super.setResizable(false);
		super.pack();
		super.setTitle("ChessBoard");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setLocationRelativeTo(null);
	}
	
	public static void main(String [] args) {
		Application app = new Application();
		app.setVisible(true);
	}
	

}
