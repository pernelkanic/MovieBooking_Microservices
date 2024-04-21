package BookingNotificationService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class BookingNotificationService {

	public static void main(String[] args) {
		SpringApplication.run(BookingNotificationService.class, args);

	}
	
	@KafkaListener(topics = "bookingnotificationTopic")
	public void handleBookingNotification(bookingPlacedEvent bookingid) {
		log.info("The booking has been confirmed - booking id is - {}" , bookingid.getBookingId());
		

	}
	

}
