package az.atlacademy.springbootrelations.dto;

import az.atlacademy.springbootrelations.entity.OrderEntity;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerResponse implements Serializable {

    Long id;
    String fullName;
    String email;
    List<OrderEntity> orders;

}
