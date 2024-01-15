package br.com.airplaces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AirPlacesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirPlacesApplication.class, args);
	}

}
