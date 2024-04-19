package com.example.MovieMicroservices.Models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(Long movieId, List<ShowTime> show, String title, String genre, Long duration) {
		super();
		this.movieId = movieId;
		this.show = show;
		this.title = title;
		this.genre = genre;
		this.duration = duration;
	}
	public Long getMovieId() {
		return movieId;
	}
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}
	public List<ShowTime> getShow() {
		return show;
	}
	public void setShow(List<ShowTime> show) {
		this.show = show;
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
	

	

	
}
