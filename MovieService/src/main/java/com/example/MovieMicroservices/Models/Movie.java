package com.example.MovieMicroservices.Models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Movies")
public class Movie {
	
	@Id
	 @Column(name="movieId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long movieId;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "movieId", referencedColumnName = "movieId")

	private List<ShowTime> show;
	
	private String title;
	private String 	genre;
	private Long  duration;
	public Long getMovieId() {
		return movieId;
	}
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Long getDuration() {
		return duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Movie(Long movieId, List<ShowTime> show, String title, String genre, Long duration) {
		super();
		this.movieId = movieId;
		this.show = show;
		this.title = title;
		this.genre = genre;
		this.duration = duration;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<ShowTime> getShow() {
		return show;
	}
	public void setShow(List<ShowTime> show) {
		this.show = show;
	}



	
}
