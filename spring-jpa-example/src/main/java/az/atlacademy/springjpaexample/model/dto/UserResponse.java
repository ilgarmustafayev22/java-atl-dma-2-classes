package az.atlacademy.springjpaexample.model.dto;

import az.atlacademy.springjpaexample.model.enums.UserGender;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {

    Long id;
    String name;
    String surname;
    LocalDate birthDate;
    UserGender userGender;

}
