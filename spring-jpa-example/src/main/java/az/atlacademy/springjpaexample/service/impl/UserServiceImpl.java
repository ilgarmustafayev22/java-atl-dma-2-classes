package az.atlacademy.springjpaexample.service.impl;

import az.atlacademy.springjpaexample.dao.entity.UserEntity;
import az.atlacademy.springjpaexample.dao.repository.UserRepository;
import az.atlacademy.springjpaexample.model.dto.CreateUserRequest;
import az.atlacademy.springjpaexample.model.dto.UserResponse;
import az.atlacademy.springjpaexample.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

  //  public UserServiceImpl(UserRepository userRepository) {
  //      this.userRepository = userRepository;
  //  }

    @Override
    public UserResponse createUser(CreateUserRequest userRequest) {
        //UserEntity userEntity = new UserEntity();
        //userEntity.setName(userRequest.getName());
        //userEntity.setSurname(userRequest.getSurname());
        //userEntity.setBirthDate(userRequest.getBirthDate());
        //userEntity.setUserGender(userRequest.getUserGender());

        UserEntity userEntity = UserEntity.builder()
                .name(userRequest.getName())
                .surname(userRequest.getSurname())
                .birthDate(userRequest.getBirthDate())
                .userGender(userRequest.getUserGender())
                .build();

        UserEntity savedUser = userRepository.save(userEntity);

        UserResponse userResponse = new UserResponse();
        userResponse.setId(savedUser.getId());
        userResponse.setName(savedUser.getName());
        userResponse.setSurname(savedUser.getSurname());
        userResponse.setBirthDate(savedUser.getBirthDate());
        userResponse.setUserGender(savedUser.getUserGender());

        return userResponse;
    }

    @Override
    public UserResponse findUserById(Long id) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }

}
