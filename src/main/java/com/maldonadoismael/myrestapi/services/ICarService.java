package com.maldonadoismael.myrestapi.services;

import com.maldonadoismael.myrestapi.models.Car;

import java.util.List;

public interface ICarService {

    public List<Car> listAllCars();
    public Car saveNewCar(Car car);
    public Car getCarByID(Long id);
    public Car updateCar(Car car);
    public void deleteCar(Long id);
}
