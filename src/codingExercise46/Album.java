package codingExercise46;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	private String name;
	private String artist;
	private ArrayList<Song> songs;
	public Album(String name, String artist) {
		super();
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<>();
	}
	
//	public boolean  addSong(String title,double duration) {
//		Song song=new Song(title,duration);
//		if(songs.indexOf(song)>=0) {
//			return false;
//		}
//		songs.add(song);
//		return true;
//		}
	 public boolean addSong(String title, double duration) {
	        Song song = findSong(title);
	        if (song == null) {
	            song = new Song(title, duration);
	            songs.add(song);
	            return true;
	        }
	        return false;
	    }

	public Song findSong(String title) {
		for(Song song:songs) {
			if(song.getTitle().equals(title)) {
				return song;
			}
		}
		return null;
		
		
		
	}
	 public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
	        if (trackNumber >= 1 && trackNumber <= songs.size()) {
	            Song song = songs.get(trackNumber - 1);
	            playlist.add(song);
	            return true;
	        }
	        return false;
	    }

	    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
	        Song song = findSong(title);
	        if (song != null) {
	            playlist.add(song);
	            return true;
	        }
	        return false;
	    }
}
