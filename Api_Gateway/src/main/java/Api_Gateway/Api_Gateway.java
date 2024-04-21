package Api_Gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Api_Gateway {
	public static void main(String[] args) {
		SpringApplication.run(Api_Gateway.class, args);
	}
}
