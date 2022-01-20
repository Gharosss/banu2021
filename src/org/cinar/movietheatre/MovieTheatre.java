package org.cinar.movietheatre;

public class MovieTheatre {
	Ticket ticket;
	Session[] sessions;
	Saloon[] saloons;
	
	public Session[] findMovie(Movie movie) {
		return null;
	}
	public Session[] viewSessions(){
		return null;
	}
	public Saloon[] viewSaloons(){
		return null;
	}
	public Movie[] viewMovies(){
		return null;
	}
	public Ticket bookSession(Session session, int seat){
		return null;
	}
	
	public MovieTheatre(Ticket ticket, Session[] sessions, Saloon[] saloons) {
		super();
		this.ticket = ticket;
		this.sessions = sessions;
		this.saloons = saloons;
	}
	
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public Session[] getSessions() {
		return sessions;
	}
	public void setSessions(Session[] sessions) {
		this.sessions = sessions;
	}
	public Saloon[] getSaloons() {
		return saloons;
	}
	public void setSaloons(Saloon[] saloons) {
		this.saloons = saloons;
	}
}
