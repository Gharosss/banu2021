package org.cinar.movietheatre;

public class Movie {
	
	String movieName; 
	int duration;
	String genre;
	
	public Movie(String movieName, int duration, String genre) {
		super();
		this.movieName = movieName;
		this.duration = duration;
		this.genre = genre;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
}
