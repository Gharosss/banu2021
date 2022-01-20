package org.cinar.movietheatre;

public class Session {
	Movie movie; 
	double price;
	boolean is3D; 
	double startTime ;
	double endTime;
	Saloon saloon; 
	boolean[] seats;
	
	public Session(Movie movie, double price, boolean is3d, double startTime, double endTime, Saloon saloon,
			boolean[] seats) {
		super();
		this.movie = movie;
		this.price = price;
		is3D = is3d;
		this.startTime = startTime;
		this.endTime = endTime;
		this.saloon = saloon;
		this.seats = seats;
	}
	
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isIs3D() {
		return is3D;
	}
	public void setIs3D(boolean is3d) {
		is3D = is3d;
	}
	public double getStartTime() {
		return startTime;
	}
	public void setStartTime(double startTime) {
		this.startTime = startTime;
	}
	public double getEndTime() {
		return endTime;
	}
	public void setEndTime(double endTime) {
		this.endTime = endTime;
	}
	public Saloon getSaloon() {
		return saloon;
	}
	public void setSaloon(Saloon saloon) {
		this.saloon = saloon;
	}
	public boolean[] getSeats() {
		return seats;
	}
	public void setSeats(boolean[] seats) {
		this.seats = seats;
	} 

}
