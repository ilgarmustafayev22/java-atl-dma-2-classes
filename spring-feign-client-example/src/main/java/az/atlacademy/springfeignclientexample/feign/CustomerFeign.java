package az.atlacademy.springfeignclientexample.feign;

import az.atlacademy.springfeignclientexample.model.CreateCustomerRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "customer-feign", url = "http://localhost:8081/api/v1/customers")
public interface CustomerFeign {

    @PostMapping
    void createCustomer(CreateCustomerRequest request);

}
