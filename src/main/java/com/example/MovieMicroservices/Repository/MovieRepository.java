package com.example.MovieMicroservices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MovieMicroservices.Models.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
	

}
