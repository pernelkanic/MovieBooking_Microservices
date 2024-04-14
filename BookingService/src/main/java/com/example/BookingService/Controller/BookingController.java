package com.example.BookingService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookingService.DTO.BookingDTO;
import com.example.BookingService.Models.Booking;
import com.example.BookingService.Services.BookingService;

@RestController
@RequestMapping("/api/book")
public class BookingController {
//	getbooking
//	postbooking
//	getbookingbyid
	private final BookingService bookserv;
	@Autowired
	public BookingController(BookingService bookserv) {
		this.bookserv = bookserv;
	}
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Booking> getBooking(){
		return bookserv.getAll();
	}
	@PostMapping("")
	public Long postBooking(@RequestBody BookingDTO bookingdto) {
		return bookserv.postBooking(bookingdto);
	}
//	@GetMapping
//	public Booking getBooking(Long id) { 
//		return bookserv.getBookingById(id);
//		
//	}
	
	


	
}
