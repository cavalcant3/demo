package academy.devdojo.springboot2.exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class BadRequestExeptionDetails {
    private String title;
    private int status;
    private String details;
    private String developerMessaage;
    private LocalDateTime timestamp;

}
