package az.atlacademy.springbootexample.controller;

import az.atlacademy.springbootexample.model.Car;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/cars")
public class CarController {

    private final List<Car> cars;

    @PostMapping
    public ResponseEntity<List<Car>> createCar(@RequestBody Car car) {
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

        return ResponseEntity.status(HttpStatus.CREATED).body(cars);
    }

}
