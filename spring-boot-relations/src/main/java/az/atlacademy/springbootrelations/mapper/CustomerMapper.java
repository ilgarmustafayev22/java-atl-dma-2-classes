package az.atlacademy.springbootrelations.mapper;

import az.atlacademy.springbootrelations.dto.CreateCustomerRequest;
import az.atlacademy.springbootrelations.dto.CustomerResponse;
import az.atlacademy.springbootrelations.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerMapper {

    CustomerEntity toEntity(CreateCustomerRequest customerRequest);

    CustomerResponse toDto(CustomerEntity customerEntity);

}
