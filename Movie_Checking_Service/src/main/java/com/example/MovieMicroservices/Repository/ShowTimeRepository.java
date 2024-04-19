package com.example.MovieMicroservices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.MovieMicroservices.Models.ShowTime;

public interface ShowTimeRepository extends JpaRepository<ShowTime , Long>{
	@Query("SELECT seats FROM ShowTime st WHERE st.movieId  = ?1 and st.time = ?2")
	Long findBytitleAndtiming(@Param("movieid")Long movieId, @Param("time") String time);
}
