package az.atlacademy.springbootrelations.service.impl;

import az.atlacademy.springbootrelations.dto.CreateOrderRequest;
import az.atlacademy.springbootrelations.dto.OrderResponse;
import az.atlacademy.springbootrelations.entity.CustomerEntity;
import az.atlacademy.springbootrelations.entity.OrderEntity;
import az.atlacademy.springbootrelations.exception.OrderNotFoundException;
import az.atlacademy.springbootrelations.mapper.OrderMapper;
import az.atlacademy.springbootrelations.repository.OrderRepository;
import az.atlacademy.springbootrelations.service.OrderService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderMapper orderMapper;
    private final OrderRepository orderRepository;

    @Override
    @Transactional
    public OrderResponse createOrder(CreateOrderRequest orderRequest) {
     // OrderEntity orderEntity = OrderEntity.builder()
     //         .description(orderRequest.getDescription())
     //         .customer(CustomerEntity.builder().id(orderRequest.getCustomerId()).build())
     //         .build();

     // OrderEntity savedOrder = orderRepository.save(orderEntity);

     // return OrderResponse.builder()
     //         .id(savedOrder.getId())
     //         .description(savedOrder.getDescription())
     //         .customerId(savedOrder.getCustomer().getId())
     //         .build();

        OrderEntity orderEntity = orderRepository.save(orderMapper.toEntity(orderRequest));
        return orderMapper.toDto(orderEntity);
    }

    @Override
    public OrderResponse findById(Long id) {
       // return orderRepository.findById(id)
       //         .map(orderEntity -> OrderResponse.builder()
       //                 .id(orderEntity.getId())
       //                 .description(orderEntity.getDescription())
       //                 .customerId(orderEntity.getCustomer().getId())
       //                 .build())
       //         .orElseThrow(() -> new OrderNotFoundException("Order not found with id " + id));

        return orderRepository.findById(id)
                .map(orderMapper::toDto)
                .orElseThrow(() -> new OrderNotFoundException("Order not found with id " + id));
    }

    @Override
    public List<OrderResponse> findAll() {
       //return orderRepository.findAll().stream()
       //        .map(orderEntity -> OrderResponse.builder()
       //                .id(orderEntity.getId())
       //                .description(orderEntity.getDescription())
       //                .customerId(orderEntity.getCustomer().getId())
       //                .build())
       //        .collect(Collectors.toList());

        return orderRepository.findAll().stream()
                .map(orderMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void updateOrder(Long id, CreateOrderRequest orderRequest) {
        OrderEntity orderEntity = orderRepository.findById(id)
                .orElseThrow(() -> new OrderNotFoundException("Order not found with id " + id));

        orderEntity.setDescription(orderRequest.getDescription());
        orderRepository.save(orderEntity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        orderRepository.deleteById(id);
    }

}
