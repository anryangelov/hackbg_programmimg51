package com.hackbulgaria.programming51.week4;

public class Song {

	private String name;
	private String artist;
	private int duration;
	private String album;
	
	
	public Song(String name, String artist, int duration, String album) {
		this.name = name;
		this.artist = artist;
		this.duration = duration;
		this.album = album;
	}
	
	public String toString() {
		return name + "; " + artist + "; " + duration + "; " + album;  
	}
	
	public String getName() {
		return name;
	}
	
	public String getAlbum() {
		return album;
	}
}

