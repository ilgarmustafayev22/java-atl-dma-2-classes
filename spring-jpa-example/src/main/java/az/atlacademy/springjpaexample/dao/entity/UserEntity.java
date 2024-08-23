package az.atlacademy.springjpaexample.dao.entity;

import az.atlacademy.springjpaexample.model.enums.UserGender;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @DateTimeFormat(iso = DateTimeFormat.ISO.NONE)
    @JsonFormat(pattern = "MM/dd/yyyy")
    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_gender", nullable = false)
    private UserGender userGender;

}
