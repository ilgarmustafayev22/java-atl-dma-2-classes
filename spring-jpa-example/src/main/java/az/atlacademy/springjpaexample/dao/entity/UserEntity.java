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

    public static UserEntityBuilder builder() {
        return new UserEntityBuilder();
    }

    public static class UserEntityBuilder {
        private Long id;
        private String name;
        private String surname;
        private LocalDate birthDate;
        private UserGender userGender;

        public UserEntityBuilder() {

        }

        public UserEntityBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public UserEntityBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserEntityBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public UserEntityBuilder birthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public UserEntityBuilder userGender(UserGender userGender) {
            this.userGender = userGender;
            return this;
        }

        public UserEntity build() {
            return new UserEntity(id, name, surname, birthDate, userGender);
        }
    }

}
