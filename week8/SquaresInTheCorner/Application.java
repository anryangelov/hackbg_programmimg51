package com.hackbulgaria.programming51.week8.SquaresInTheCorner;

import javax.swing.JFrame;

public class Application extends JFrame {

	public Application() {
		add(new Canvas());

		setResizable(false);
		pack();

		setTitle("My application name");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		Application app = new Application();
		app.setVisible(true);
	}
}