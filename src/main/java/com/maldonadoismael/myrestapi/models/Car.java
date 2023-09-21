package com.maldonadoismael.myrestapi.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "plate", unique = true)
    private String plate;
    @Column(name = "manufacturer")
    private String manufacturer;
    @Column(name = "model")
    private String model;

    public Car() {
    }

    public Car(String plate, String manufacturer, String model) {
        this.plate = plate;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return
                "{"+
                "id=" + id +
                        ", plate='" + plate + '\'' +
                        ", manufacturer='" + manufacturer + '\'' +
                        ", model='" + model + '\'' +
                        '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id) && Objects.equals(plate, car.plate) && Objects.equals(manufacturer, car.manufacturer) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, plate, manufacturer, model);
    }
}
