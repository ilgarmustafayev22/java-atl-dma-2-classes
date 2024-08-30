package az.atlacademy.springbootrelations.repository;

import az.atlacademy.springbootrelations.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

}
