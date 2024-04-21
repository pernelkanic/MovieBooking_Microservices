package com.example.BookingService.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class bookingPlacedEvent {
	private Long bookingId;
	
}
