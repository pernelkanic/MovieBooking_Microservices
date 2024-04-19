package com.example.MovieMicroservices.DTO;


public class BookingServiceDTO {
	private String movieName;
	private Integer seats;
	private String time ;
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Integer getSeats() {
		return seats;
	}
	public void setSeats(Integer seats) {
		this.seats = seats;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public BookingServiceDTO(String movieName, Integer seats, String time) {
		super();
		this.movieName = movieName;
		this.seats = seats;
		this.time = time;
	}
	public BookingServiceDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
