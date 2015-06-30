package com.hackbulgaria.programming51.week4;

public class MusicOrganiser {
	
	private Vector<Song> songs;
	
	
	public MusicOrganiser() {
		songs = new Vector<Song>();
		
	}
	
	public void addSong(Song s) {
		songs.add(s);
	}
	
	public int getCount() {
		return songs.size();
	}
	
	public Vector<String> getAlbums() {
		Vector<String> res = new Vector<String>();
		String album;
		for (int i = 0; i < songs.size(); i++) {
			album = songs.get(i).getAlbum();
			if (! res.hasElement(album)) {
				res.add(album);
			}
		}
		return res;
	}
	
	public int getAlbumsCount() {
		return getAlbums().size();
	}
	
	public Vector<Song> getAlbumSongs(String albumName) {
		Vector<Song> res = new Vector<Song>();
		Song song;
		for (int i = 0; i < songs.size(); i++) {
			song = songs.get(i); 
			if (song.getAlbum().equals(albumName)) res.add(song);
		}
		return res;
	}
	
	public Vector<String> getAlbumsAndSongs() {
		Vector<String> res = new Vector<String>();
		Vector<String> albums = getAlbums();
        String album;
		for (int i = 0; i < albums.size(); i++) {
			album = albums.get(i);
			res.add(album + "(" + getAlbumSongs(album).size() + ")");
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		MusicOrganiser mo = new MusicOrganiser();

		mo.addSong(new Song("The real Slim Shady", "Eminem", 213, "The Marshall Mathers LP"));
		mo.addSong(new Song("The Way I Am", "Eminem", 183, "The Marshall Mathers LP"));
		mo.addSong(new Song("When I'm Gone", "Eminem", 256, "Curtain Call: The Hits"));
		mo.addSong(new Song("Lose Yourself", "Eminem", 221, "Curtain Call: The Hits"));
		mo.addSong(new Song("Opa Opa", "Eminem", 186, "The Marshall Mathers LP"));
		mo.addSong(new Song("I am happy", "Eminem", 186, "The Marshall Mathers LP"));
		mo.addSong(new Song("find yourself", "Eminem", 221, "Curtain Call: The Hits"));
		mo.addSong(new Song("Pray to God", "Calvin Harris", 221, "Motion"));
		
		System.out.println("Number of songs: " + mo.getCount());
		System.out.println("Number of albums: " + mo.getAlbumsCount());
		System.out.println("Albums: " +  mo.getAlbums());
		String album = "The Marshall Mathers LP";
		System.out.println("the songs in " + album + " album :");
		Vector<Song> songs = mo.getAlbumSongs(album);
		for (int i = 0; i < songs.size(); i++) {
			System.out.println("\t" + songs.get(i));
		}
		System.out.println("getAlbumsAndSongs:");
		Vector<String> nsongs = mo.getAlbumsAndSongs();
		for(int i = 0; i < nsongs.size(); i++) {
		    System.out.println("\t" + nsongs.get(i));
		}
		
	}

}
