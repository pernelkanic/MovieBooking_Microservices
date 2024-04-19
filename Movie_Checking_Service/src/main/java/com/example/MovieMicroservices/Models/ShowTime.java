package com.example.MovieMicroservices.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ShowTime")
public class ShowTime {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="showid")
	private Long showid;
	
	private String CinemaHall;
	
	private Long seats  ;
	private String time ;
	
	@ManyToOne 
	   @JoinColumn(name = "movieId")
	private Movie movie;
	
	 


	    @Column(name = "movieId", insertable = false, updatable = false)
	    private Long movieId;

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
