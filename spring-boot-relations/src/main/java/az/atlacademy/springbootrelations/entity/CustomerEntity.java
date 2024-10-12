package az.atlacademy.springbootrelations.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customers")
@NamedEntityGraph(name = "Customer.orders",
        attributeNodes = @NamedAttributeNode("orders"))
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", length = 50)
    private String fullName;

    @Column(name = "email", unique = true, length = 30)
    private String email;

   //@Column(name = "birth_date")
   //private LocalDate birthDate;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonBackReference
    private List<OrderEntity> orders;

}
