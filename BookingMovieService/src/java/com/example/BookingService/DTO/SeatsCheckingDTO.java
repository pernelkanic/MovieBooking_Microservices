package com.example.BookingService.DTO;

public class SeatsCheckingDTO {
	private String movieName;


	private String time ;
	private Integer seats;
	public String getMoviename() {
		return movieName;
	}
	public void setMoviename(String moviename) {
		this.movieName = moviename;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Integer getSeats() {
		return seats;
	}
	public void setSeats(Integer seats) {
		this.seats = seats;
	}
	public SeatsCheckingDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SeatsCheckingDTO(String moviename, String time, Integer seats) {
		super();
		this.movieName = moviename;
		this.time = time;
		this.seats = seats;
	}

	
	
}
