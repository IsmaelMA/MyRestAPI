package com.maldonadoismael.myrestapi.repositories;

import com.maldonadoismael.myrestapi.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}
