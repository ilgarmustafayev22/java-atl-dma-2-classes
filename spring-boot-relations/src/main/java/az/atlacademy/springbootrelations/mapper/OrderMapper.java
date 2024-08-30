package az.atlacademy.springbootrelations.mapper;

import az.atlacademy.springbootrelations.dto.CreateOrderRequest;
import az.atlacademy.springbootrelations.dto.OrderResponse;
import az.atlacademy.springbootrelations.entity.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderMapper {

    @Mapping(source = "customerId", target = "customer.id")
    OrderEntity toEntity(CreateOrderRequest orderRequest);

    @Mapping(source = "customer.id", target = "customerId")
    OrderResponse toDto(OrderEntity orderEntity);

}
