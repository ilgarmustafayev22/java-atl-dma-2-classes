package az.atlacademy.springbootrelations.service.impl;

import az.atlacademy.springbootrelations.dto.CreateCustomerRequest;
import az.atlacademy.springbootrelations.dto.CustomerResponse;
import az.atlacademy.springbootrelations.entity.CustomerEntity;
import az.atlacademy.springbootrelations.exception.CustomerNotFoundException;
import az.atlacademy.springbootrelations.mapper.CustomerMapper;
import az.atlacademy.springbootrelations.repository.CustomerRepository;
import az.atlacademy.springbootrelations.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerMapper customerMapper;
    private final CustomerRepository customerRepository;

    @Override
    @Transactional
    public CustomerResponse createCustomer(CreateCustomerRequest request) {
      // CustomerEntity customerEntity = CustomerEntity.builder()
      //         .fullName(request.getFullName())
      //         .email(request.getEmail())
      //         .build();

      // CustomerEntity savedCustomer = customerRepository.save(customerEntity);

      // return CustomerResponse.builder()
      //         .id(savedCustomer.getId())
      //         .fullName(savedCustomer.getFullName())
      //         .email(savedCustomer.getEmail())
      //         .orders(savedCustomer.getOrders())
      //         .build();

        CustomerEntity customerEntity = customerRepository.save(customerMapper.toEntity(request));
        return customerMapper.toDto(customerEntity);
    }

    @Override
    public CustomerResponse findById(Long id) {
      //  return customerRepository.findById(id)
      //          .map(customerEntity -> CustomerResponse.builder()
      //                  .id(customerEntity.getId())
      //                  .fullName(customerEntity.getFullName())
      //                  .email(customerEntity.getEmail())
      //                  .orders(customerEntity.getOrders())
      //                  .build())
      //          .orElseThrow(() -> new CustomerNotFoundException("Customer not found with id" + id));

        return customerRepository.findById(id)
                .map(customerMapper::toDto)
                .orElseThrow(() -> new CustomerNotFoundException("Customer not found with id" + id));
    }



    @Override
    public List<CustomerResponse> findAll() {
       // return customerRepository.findAll().stream()
       //         .map(customerEntity -> CustomerResponse.builder()
       //                 .id(customerEntity.getId())
       //                 .fullName(customerEntity.getFullName())
       //                 .email(customerEntity.getEmail())
       //                 .orders(customerEntity.getOrders())
       //                 .build())
       //         .collect(Collectors.toList());

        return customerRepository.findAllCustomers().stream()
                .map(customerMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void updateCustomer(Long id, CreateCustomerRequest request) {
        CustomerEntity customerEntity = customerRepository.findById(id)
                .orElseThrow(() -> new CustomerNotFoundException("Customer not found with id" + id));

        customerEntity.setFullName(request.getFullName());
        customerEntity.setEmail(request.getEmail());

        customerRepository.save(customerEntity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public CustomerResponse findByEmail(String email) {
        return customerRepository.findByEmail(email)
                .map(customerMapper::toDto)
                .orElseThrow(() -> new CustomerNotFoundException("Customer not found with email" + email));
    }

}
