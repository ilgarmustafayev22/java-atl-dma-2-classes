package az.atlacademy.springjpaexample;

import az.atlacademy.springjpaexample.controller.UserController;
import az.atlacademy.springjpaexample.dao.repository.UserRepository;
import az.atlacademy.springjpaexample.service.UserService;
import az.atlacademy.springjpaexample.service.impl.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJpaExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaExampleApplication.class, args);
    }

}
