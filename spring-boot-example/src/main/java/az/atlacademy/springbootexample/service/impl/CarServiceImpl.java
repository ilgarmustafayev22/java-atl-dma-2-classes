package az.atlacademy.springbootexample.service.impl;

import az.atlacademy.springbootexample.model.Car;
import az.atlacademy.springbootexample.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    private final List<Car> cars;

    @Override
    public List<Car> createCar(Car car) {
        cars.add(new Car(1L, "BMW"));
        cars.add(new Car(2L, "AUDI"));
        cars.add(new Car(3L, "MERCEDES"));
        cars.add(new Car(4L, "MAZDA"));
        cars.add(new Car(5L, "FORD"));
        cars.add(new Car(6L, "VOLVO"));
        cars.add(new Car(7L, "HONDA"));
        cars.add(new Car(8L, "LADA"));
        cars.add(new Car(9L, "TOYOTA"));
        cars.add(new Car(10L, "LEXUS"));

        Car requestCar = new Car(car.getId(), car.getModel());
        cars.add(requestCar);
        return cars;
    }

}
