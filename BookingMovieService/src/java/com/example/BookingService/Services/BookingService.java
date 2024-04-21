package com.example.BookingService.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.BookingService.DTO.BookingDTO;
import com.example.BookingService.DTO.SeatsCheckingDTO;
import com.example.BookingService.Models.Booking;
import com.example.BookingService.Repository.BookingRepository;
import com.example.BookingService.events.bookingPlacedEvent;
@Service
@Transactional


public class BookingService {
	private final BookingRepository bookrepo;
	@Autowired
	public BookingService(BookingRepository bookrepo ,KafkaTemplate<String, bookingPlacedEvent> template) {
		this.bookrepo = bookrepo;
		this.kafkatemplate = template;
		
	}
	private final KafkaTemplate<String, bookingPlacedEvent> kafkatemplate;

	 @Autowired
	    private  WebClient.Builder webclientBuilder;
	
	public List<Booking> getAll(){
		return bookrepo.findAll();
	}
	public Integer postBooking(BookingDTO bookingdto) {
		
		Booking book = new Booking();
		
		book.setCinemahall(bookingdto.getCinemahall());
		book.setMovieName(bookingdto.getMovieName());
		book.setSeats(bookingdto.getSeats());
		book.setTime(bookingdto.getTiming());
		book.setUserId(bookingdto.getUserId());
		
		SeatsCheckingDTO seatscheck = new SeatsCheckingDTO();
		seatscheck.setMoviename(bookingdto.getMovieName());
		seatscheck.setSeats(bookingdto.getSeats());
		seatscheck.setTime(bookingdto.getTiming());
		
		boolean isValidSeats = webclientBuilder.build().get()
        .uri("http://MovieCheckingService/api/movies/boolcheck",
                uriBuilder -> uriBuilder
                .queryParam("movieName", seatscheck.getMoviename())
                .queryParam("seats", seatscheck.getSeats())
                .queryParam("time", seatscheck.getTime())
                .build()
                
        		)
        .retrieve()
        .bodyToMono(Boolean.class)
        .block();
		
		
		if(isValidSeats) {	
			bookrepo.save(book);

			kafkatemplate.send("bookingnotificationTopic" , new bookingPlacedEvent(book.getBookingId()) );
			return book.getSeats();
			
		}
		else {
			throw new IllegalArgumentException("Seats are not available sorry ... !");
		}
		}
	
}

