package com.example.MovieMicroservices.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MovieMicroservices.DTO.BookingServiceDTO;
import com.example.MovieMicroservices.Models.Movie;
import com.example.MovieMicroservices.Repository.MovieRepository;
import com.example.MovieMicroservices.Repository.ShowTimeRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movrepo;
	@Autowired 
	private ShowTimeRepository showrepo;
	//getMovie
	public List<Movie> getMovies(){
		return movrepo.findAll();
	}
	//postmovie
	public Long postMovie(Movie movie) {
		  
		  movrepo.save(movie);
		  
		  return movie.getMovieId();
		
	}
	public Movie getMovieById(Long id ) {
		return movrepo.findById(id).get();
	}
	public boolean getBoolByseats(BookingServiceDTO bookingdto) { 
		Long movieid = movrepo.findBytitle(bookingdto.getMovieName());
		
		Long seats = showrepo.findBytitleAndtiming(movieid, bookingdto.getTime());
		if(bookingdto.getSeats() < seats) {
			return true;
		}
		return false;		
	}
	
}
