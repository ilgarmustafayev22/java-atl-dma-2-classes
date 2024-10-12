package az.atlacademy.springbootrelations.service.impl;

import az.atlacademy.springbootrelations.dto.CreateCustomerRequest;
import az.atlacademy.springbootrelations.dto.CustomerResponse;
import az.atlacademy.springbootrelations.entity.CustomerEntity;
import az.atlacademy.springbootrelations.mapper.CustomerMapper;
import az.atlacademy.springbootrelations.repository.CustomerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(value = MockitoExtension.class)
class CustomerServiceImplTest {

    @Mock
    private  CustomerMapper customerMapper;

    @Mock
    private  CustomerRepository customerRepository;

    @InjectMocks
    private CustomerServiceImpl customerService;

    @Test
    public void create_customer_success_case(){
        CreateCustomerRequest customerRequest = CreateCustomerRequest.builder()
                .fullName("Test Test2")
                .email("test@gmail.com")
                .build();

        CustomerEntity customerEntity = CustomerEntity
                .builder()
                .id(1L)
                .fullName(customerRequest.getFullName())
                .email(customerRequest.getEmail())
                .build();

        when(customerRepository.save(customerEntity)).thenReturn(customerEntity);
        when(customerMapper.toEntity(customerRequest)).thenReturn(customerEntity);

        Assertions.assertDoesNotThrow(() ->customerService.createCustomer(customerRequest));
    }

}