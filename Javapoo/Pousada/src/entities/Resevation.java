package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Resevation {
	
	private static DateTimeFormatter dd = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	public Resevation() {
		
	}

	public Resevation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getChekIn() {
		return checkIn;
	}
	
	public LocalDate getCheckOut() {
		return checkOut;
	}

	public Long duration() {
		long diff = ChronoUnit.DAYS.between(checkIn, checkOut);
		return diff;
	}
	
	public void updateDates(LocalDate checkIn,LocalDate checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut; 		
	}
	
	@Override
	public String toString() {
		return "Room" 
				+ roomNumber
				+", check-in: "
				+dd.format(checkIn)
				+", check-out: "
				+dd.format(checkOut)
				+", "
				+duration()
				+"nights";
	}
	
	
	
	
	

}
