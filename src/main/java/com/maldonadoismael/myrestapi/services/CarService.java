package com.maldonadoismael.myrestapi.services;

import com.maldonadoismael.myrestapi.models.Car;
import com.maldonadoismael.myrestapi.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService implements ICarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> listAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car saveNewCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car getCarByID(Long id) {
        Optional<Car> carOptional = carRepository.findById(id);
        return carOptional.orElse(new Car());
    }

    @Override
    public Car updateCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}
