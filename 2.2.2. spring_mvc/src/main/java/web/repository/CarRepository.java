package web.repository;

import web.entity.Car;

import java.util.List;

public interface CarRepository {
    List<Car> findAllCars();
    List<Car> findCars(int count);
}
