package az.atlacademy.springfeignclientexample.controller;

import az.atlacademy.springfeignclientexample.model.CreateCustomerRequest;
import az.atlacademy.springfeignclientexample.feign.CustomerFeign;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/feign")
public class CustomerController {

    private final CustomerFeign customerFeign;

    @PostMapping
    public ResponseEntity<Void> createCustomer(@RequestBody CreateCustomerRequest request){
        customerFeign.createCustomer(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
