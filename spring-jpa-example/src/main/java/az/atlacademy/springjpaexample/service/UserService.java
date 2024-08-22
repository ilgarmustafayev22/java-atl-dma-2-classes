package az.atlacademy.springjpaexample.service;

import az.atlacademy.springjpaexample.model.dto.CreateUserRequest;
import az.atlacademy.springjpaexample.model.dto.UserResponse;

public interface UserService {

    UserResponse createUser(CreateUserRequest userRequest);

    UserResponse findUserById(Long id);

    void deleteUser(Long id);

}
