package com.example.BookingService.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookingService.DTO.BookingDTO;
import com.example.BookingService.Models.Booking;
import com.example.BookingService.Repository.BookingRepository;

@Service
public class BookingService {
	private final BookingRepository bookrepo;
	
	@Autowired
	public BookingService(BookingRepository bookrepo) {
		this.bookrepo = bookrepo;
	}
	
	public List<Booking> getAll(){
		return bookrepo.findAll();
	}
	public Long postBooking(BookingDTO bookingdto) {
		Booking book = new Booking();
		book.setCinemahall(bookingdto.getCinemahall());
		book.setMovieName(bookingdto.getMovieName());
		book.setSeats(bookingdto.getSeats());
		book.setTime(bookingdto.getTiming());
		book.setUserId(bookingdto.getUserId());
		return bookrepo.save(book).getBookingId();
		}
}

