package az.atlacademy.springbootrelations.service;

import az.atlacademy.springbootrelations.dto.CreateCustomerRequest;
import az.atlacademy.springbootrelations.dto.CustomerResponse;

import java.util.List;

public interface CustomerService {

    CustomerResponse createCustomer(CreateCustomerRequest request);

    CustomerResponse findById(Long id);

    List<CustomerResponse> findAll();

    void updateCustomer(Long id, CreateCustomerRequest request);

    void deleteById(Long id);

}
