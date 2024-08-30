package az.atlacademy.springbootrelations.service;

import az.atlacademy.springbootrelations.dto.CreateOrderRequest;
import az.atlacademy.springbootrelations.dto.OrderResponse;

import java.util.List;

public interface OrderService {

    OrderResponse createOrder(CreateOrderRequest orderRequest);

    OrderResponse findById(Long id);

    List<OrderResponse> findAll();

    void updateOrder(Long id, CreateOrderRequest orderRequest);

    void deleteById(Long id);

}
