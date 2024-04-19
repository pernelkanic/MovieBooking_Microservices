package com.example.BookingService.Models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Builder;

@Entity	
@Builder
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long BookingId;
	
	private String movieName;

	private Integer seats;
	@Column(nullable =false)
	private String Cinemahall;
	private String	 time;
	

	private Integer UserId;


	public Long getBookingId() {
		return BookingId;
	}


	public void setBookingId(Long bookingId) {
		BookingId = bookingId;
	}


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


	public String getCinemahall() {
		return Cinemahall;
	}


	public void setCinemahall(String cinemahall) {
		Cinemahall = cinemahall;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public Integer getUserId() {
		return UserId;
	}


	public void setUserId(Integer userId) {
		UserId = userId;
	}


	public Booking(Long bookingId, String movieName,Integer seats, String cinemahall, String time,
			Integer userId) {
		super();
		BookingId = bookingId;
		this.movieName = movieName;
		this.seats = seats;
		Cinemahall = cinemahall;
		this.time = time;
		UserId = userId;
	}


	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
}
