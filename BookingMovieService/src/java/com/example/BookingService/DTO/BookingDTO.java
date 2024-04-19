package com.example.BookingService.DTO;

import java.util.List;

import com.example.BookingService.Models.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingDTO {

	private String movieName;
	private Integer seats;
	private Integer UserId;
	private String timing;
	private String Cinemahall;
	
}
