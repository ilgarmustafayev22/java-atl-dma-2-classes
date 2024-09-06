package az.atlacademy.springbootrelations.dto;

import lombok.Value;

@Value
public class ErrorDto<E extends Throwable> {

    int errorCode;
    String message;
    Class<E> classType;

}
