package academy.devdojo.springboot2.handler;

import academy.devdojo.springboot2.exception.BadRequestException;
import academy.devdojo.springboot2.exception.BadRequestExeptionDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class RestExeptionHandler {
//    padrão de resposta a ser usada em erros
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<BadRequestExeptionDetails> handlerBadRequestExeption(BadRequestException bre) {
        return new ResponseEntity<>(
                BadRequestExeptionDetails.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.BAD_REQUEST.value())
                        .title("Bad Request Exeption. Please, check the documentation")
                        .details(bre.getMessage())
                        .developerMessaage(bre.getClass().getName())
                        .build(), HttpStatus.BAD_REQUEST);
    }
}
