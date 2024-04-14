package com.example.MovieMicroservices.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.MovieMicroservices.Models.Movie;
import com.example.MovieMicroservices.Services.MovieService;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
	
	@Autowired
	private MovieService movieservice;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Movie> getAllMovies(){
			return movieservice.getMovies();
			
	}
	@PostMapping("")	
	public Long postMovies(@RequestBody Movie movie) {
		return movieservice.postMovie(movie);
		
	}
	@GetMapping("/{id}")
	public Movie getMovieById(@PathVariable("id") Long movieId ) {
		return movieservice.getMovieById(movieId);
		
	}
	

}
