package com.maldonadoismael.myrestapi.controllers;

import com.maldonadoismael.myrestapi.models.Car;
import com.maldonadoismael.myrestapi.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class APIRestController {

    @Autowired(required = true)
    private CarService carService;

    @GetMapping({"/test"})
    public String sendGreetings() {
        return "Hello, world";
    }

    @GetMapping("/")
    public String getAllCars() {
        List<Car> carList = carService.listAllCars();
        if (!carList.isEmpty()) {
            return carList.toString();
        } else return "There are no cars at the DB yet";

    }

//    @GetMapping("/{id}")
//    public String getCar(@PathVariable Long id) {
//        Car returnedCar = carService.getCarByID(id);
//
//        if (returnedCar != null) {
//            return returnedCar.toString();
//
//        } else return "A car with this ID was not found";
//    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getCar(@PathVariable Long id) {
        Car returnedCar = carService.getCarByID(id);

        if (returnedCar.getId() != null) {
            return ResponseEntity.ok(returnedCar.toString());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("A car with this ID was not found");
        }
    }


    @PostMapping(value = "/create", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> createCar(@RequestBody Car car) {
        carService.saveNewCar(car);
        String responseMessage = car.toString() + " Coche creado exitosamente";
        return ResponseEntity.ok(responseMessage);
    }


}
