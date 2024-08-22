package az.atlacademy.springbootexample.controller;

import az.atlacademy.springbootexample.model.Car;
import az.atlacademy.springbootexample.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/cars")
public class CarController {

    private final CarService carService;

    @PostMapping
    public ResponseEntity<List<Car>> createCar(@RequestBody Car car) {
        //CarServiceImpl carService = new CarServiceImpl(List.of(new Car()));
        //List<Car> car1 = carService.createCar(car);
        List<Car> car1 = carService.createCar(car);
        return ResponseEntity.status(HttpStatus.CREATED).body(car1);
    }

}
