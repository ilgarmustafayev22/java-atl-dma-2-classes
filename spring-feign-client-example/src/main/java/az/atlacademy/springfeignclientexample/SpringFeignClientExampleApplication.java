package az.atlacademy.springfeignclientexample;

import az.atlacademy.springfeignclientexample.feign.CustomerFeign;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(clients = {CustomerFeign.class})
@SpringBootApplication
public class SpringFeignClientExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringFeignClientExampleApplication.class, args);
    }

}
