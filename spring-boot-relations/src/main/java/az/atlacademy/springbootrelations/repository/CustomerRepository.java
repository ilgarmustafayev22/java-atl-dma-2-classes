package az.atlacademy.springbootrelations.repository;

import az.atlacademy.springbootrelations.entity.CustomerEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

    @EntityGraph("Customer.orders")
    List<CustomerEntity> findAll();

    @Query(value = "SELECT c.* FROM customers c left join orders o on c.id = o.customer_id", nativeQuery = true)
    List<CustomerEntity> findAllCustomers();

    @Query("SELECT c FROM CustomerEntity c where c.email = :email")
    Optional<CustomerEntity> findByEmail(@Param("email") String email);

}
