package az.atlacademy.springbootrelations.repository;

import az.atlacademy.springbootrelations.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
