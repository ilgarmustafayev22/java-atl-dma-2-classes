package az.atlacademy.springjpaexample.model.dto;

import az.atlacademy.springjpaexample.model.enums.UserGender;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class CreateUserRequest {

    private String name;
    private String surname;
    private LocalDate birthDate;
    private UserGender userGender;

}
