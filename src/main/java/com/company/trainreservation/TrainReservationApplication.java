package com.company.trainreservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TrainReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainReservationApplication.class, args);
	}

}
