package az.atlacademy.springjpaexample.model.dto;

import az.atlacademy.springjpaexample.model.enums.UserGender;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class CreateUserRequest {

    private String name;
    private String surname;
    @DateTimeFormat(iso = DateTimeFormat.ISO.NONE)
    @JsonFormat(pattern="MM/dd/yyyy")
    private LocalDate birthDate;
    private UserGender userGender;

}
