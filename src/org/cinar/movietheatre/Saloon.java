package org.cinar.movietheatre;

public class Saloon {
	Session currentSession;
	int seatCount; 
	int no;
	
	public Saloon(Session currentSession, int seatCount, int no) {
		super();
		this.currentSession = currentSession;
		this.seatCount = seatCount;
		this.no = no;
	}

	public Session getCurrentSession() {
		return currentSession;
	}

	public void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
}
