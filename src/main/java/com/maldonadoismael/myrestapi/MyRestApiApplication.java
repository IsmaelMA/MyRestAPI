package com.maldonadoismael.myrestapi;

import com.maldonadoismael.myrestapi.models.Car;
import com.maldonadoismael.myrestapi.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyRestApiApplication.class, args);
	}

	@Autowired
	private CarService carService;


}
