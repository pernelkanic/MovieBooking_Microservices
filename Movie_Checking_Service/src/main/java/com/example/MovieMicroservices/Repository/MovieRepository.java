package com.example.MovieMicroservices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.MovieMicroservices.Models.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
	@Query("SELECT movieId FROM Movie m WHERE m.title=?1")
	 Long findBytitle(@Param("title") String title);

}
