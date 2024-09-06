package az.atlacademy.springbootrelations.exception.handler;

import az.atlacademy.springbootrelations.dto.ErrorDto;
import az.atlacademy.springbootrelations.exception.CustomerNotFoundException;
import az.atlacademy.springbootrelations.exception.OrderNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    @ResponseStatus(NOT_FOUND)
    public ResponseEntity<ErrorDto<OrderNotFoundException>> handleOrderNotFoundException(OrderNotFoundException ex) {
        return ResponseEntity.status(NOT_FOUND)
                .body(new ErrorDto<>(404,
                        ex.getMessage(),
                        OrderNotFoundException.class));
    }
    @ExceptionHandler
    @ResponseStatus(NOT_FOUND)
    public ResponseEntity<ErrorDto<CustomerNotFoundException>> handleCustomerNotFoundException(CustomerNotFoundException ex) {
        return ResponseEntity.status(NOT_FOUND)
                .body(new ErrorDto<>(404,
                        ex.getMessage(),
                        CustomerNotFoundException.class));
    }

}
