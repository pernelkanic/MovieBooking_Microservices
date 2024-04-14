package com.example.MovieMicroservices.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ShowTime")
public class ShowTime {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="showid")
	private Long showid;
	
	private String CinemaHall;
	
	private Long seats ;
	private String time ;
	
	

	public Long getShowid() {
		return showid;
	}

	public void setShowid(Long showid) {
		this.showid = showid;
	}

	public String getCinemaHall() {
		return CinemaHall;
	}

	public void setCinemaHall(String cinemaHall) {
		CinemaHall = cinemaHall;
	}

	public Long getSeats() {
		return seats;
	}

	public void setSeats(Long seats) {
		this.seats = seats;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	

	public ShowTime(Long showid, String cinemaHall, Long seats, String time) {
		super();
		this.showid = showid;
		CinemaHall = cinemaHall;
		this.seats = seats;
		this.time = time;
	
	}

	public ShowTime() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	
}
