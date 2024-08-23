package az.atlacademy.springjpaexample.controller;

import az.atlacademy.springjpaexample.model.dto.CreateUserRequest;
import az.atlacademy.springjpaexample.model.dto.UserResponse;
import az.atlacademy.springjpaexample.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserResponse> createUser(@RequestBody CreateUserRequest userRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(userRequest));
    }

}
