package com.hackbulgaria.programming51.week6;

import java.util.ArrayList;

public class Landscape {
	
	public class Forest implements Tile{
		public String render() {
			return "!!";
		}
	}
	
	public class Land implements Tile {		
		public String render() {
			return "--"; 
	    }
	}
		
	public class Mountain implements Tile{
		public String render() {
			return "/\\";
		}
	}
	
	public class Water implements Tile{	
		public String render() {
			return "~~";
		}
	}
	
	private ArrayList<Tile> l = new ArrayList<>();
	
	public void addTile(Tile t) {
		l.add(t);
	}
	public String renderAll() {
		String result = "";
		for (Tile t: l ) {
			result += t.render();
		}
		return result;
	}
	
	public static void main(String[] args) {
	    Landscape landscape = new Landscape();

	    landscape.addTile(landscape.new Land());
	    landscape.addTile(landscape.new Water());
	    landscape.addTile(landscape.new Mountain());
	    landscape.addTile(landscape.new Forest());

	    System.out.println(landscape.renderAll()); // --~~/\!!
	  }
}
