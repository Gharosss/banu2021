package org.cinar.movietheatre;

public class Ticket {
	
	int amount;
	int seatID;
	Session session;
	
	public Ticket(int amount, int seatID, Session session) {
		super();
		this.amount = amount;
		this.seatID = seatID;
		this.session = session;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getSeatID() {
		return seatID;
	}
	public void setSeatID(int seatID) {
		this.seatID = seatID;
	}
	public Session getSession() {
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}
}
