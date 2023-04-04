package com.assign.pac;

import java.util.ArrayDeque;
import java.util.Deque;



public class Playlist
 {
	
	  private Deque<String> songs;
	    private int capacity;

	    public Playlist(int capacity) 
	    {
	        this.songs = new ArrayDeque<>();
	        this.capacity = capacity;
	    }

	    public void playSong(String song) 
	    {
	        
	        if (songs.size() == capacity)
	        {
	            songs.removeFirst();
	        }
	       
	        songs.addLast(song);
	    }

	    public void printPlaylist()
	    {
	        System.out.println("Current Playlist: " + songs);
	    }

	
	
	
	
	public static void main(String[] args)
	{
		
		Playlist playlist = new Playlist(3);
        playlist.playSong("S1");
        playlist.playSong("S2");
        playlist.playSong("S3");
        playlist.printPlaylist(); 
        
        playlist.playSong("S4");
        playlist.printPlaylist(); 
        
        playlist.playSong("S2");
        playlist.printPlaylist(); 
        
        playlist.playSong("S1");
        playlist.printPlaylist(); 
    }



	

	}

	
