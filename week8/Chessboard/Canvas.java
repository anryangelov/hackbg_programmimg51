package com.hackbulgaria.programming51.week8.Chessboard;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Canvas extends JPanel {

	public static final int WIDTH = 800;
	public static final int HEIGHT = 800;
	public static final int SQUARE_WIDTH = 400;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		Rectangle2D.Double r;

		int numSquares = 8;

		int lenSquare = WIDTH / numSquares;
		
		int c = 0;
		for (int i = 0; i < numSquares; i++) {
			if ((i % 2) == 0) {
				c = 0;
			} else {
				c = 1;
			}	
			for (int j = 0; j < numSquares; j++) {
				r = new Rectangle2D.Double(j * lenSquare, i * lenSquare,
						lenSquare, lenSquare);
				if ((j % 2) == c) {
					g2.setPaint(Color.GRAY);
				} else {
					g2.setPaint(Color.WHITE);
				}
				g2.fill(r);
			}
		}

	}

	public Canvas() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}

}
