package com.hackbulgaria.programming51.week8.SquaresInTheCorner;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Canvas extends JPanel {

  public static int WIDTH = 800;
  public static int HEIGHT = 800;

  public static int SQUARE_WIDTH = 400;

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    Graphics2D g2 = (Graphics2D) g;

    // an example    
    Rectangle2D.Double upLeftSquare = new Rectangle2D.Double(0, 0, SQUARE_WIDTH, SQUARE_WIDTH);
    g2.setPaint(Color.GREEN);
    g2.fill(upLeftSquare);
    Rectangle2D.Double upRightSquare = new Rectangle2D.Double(400, 0, SQUARE_WIDTH, SQUARE_WIDTH);
    g2.setPaint(Color.BLACK);
    g2.fill(upRightSquare);
    Rectangle2D.Double downLeftSquare = new Rectangle2D.Double(0,400, SQUARE_WIDTH, SQUARE_WIDTH);
    g2.setPaint(Color.PINK);
    g2.fill(downLeftSquare);
    Rectangle2D.Double downRightSquare = new Rectangle2D.Double(400, 400, SQUARE_WIDTH, SQUARE_WIDTH);
    g2.setPaint(Color.BLUE);
    g2.fill(downRightSquare);
    
  }

  public Canvas() {
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
  }
}