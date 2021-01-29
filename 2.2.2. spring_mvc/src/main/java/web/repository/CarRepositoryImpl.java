package web.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.entity.Car;

import java.util.List;

@Repository
public class CarRepositoryImpl implements CarRepository {
    private List<Car> cars;

    @Autowired
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }


    @Override
    public List<Car> findAllCars() {
        return cars;
    }

    @Override
    public List<Car> findCars(int count) {
        return cars.subList(0, count);
    }
}
