package com.example.BookingService.Models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;

@Entity	
@Builder
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long BookingId;
	
	private String movieName;
	private List<Integer> seats;
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
	public Booking(Long bookingId, String movieName, List<Integer> seats, String cinemahall, String time) {
		super();
		BookingId = bookingId;
		this.movieName = movieName;
		this.seats = seats;
		Cinemahall = cinemahall;
		this.time = time;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public List<Integer> getSeats() {
		return seats;
	}
	public void setSeats(List<Integer> seats) {
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
	public void setUserId(Integer UserId) {
		this.UserId = UserId;
	}
	public Booking(Long bookingId, String movieName, List<Integer> seats, String cinemahall, String time, Integer UserId) {
		super();
		BookingId = bookingId;
		this.movieName = movieName;
		this.seats = seats;
		Cinemahall = cinemahall;
		this.time = time;
		this.UserId = UserId;
	}
	
	
}
