package com.example.MovieMicroservices.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.MovieMicroservices.DTO.BookingServiceDTO;
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
	@GetMapping("/boolcheck")
	public boolean getBoolBySeats(@RequestParam String movieName , @RequestParam Integer seats , @RequestParam String time   ) {
		BookingServiceDTO bookingdto = new BookingServiceDTO();
		bookingdto.setMovieName(movieName);
		bookingdto.setSeats(seats);
		bookingdto.setTime(time);
		
		
		return movieservice.getBoolByseats(bookingdto);
		
	}
	

}
