package academy.devdojo.springboot2.requests;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class AnimePostRequestBody {
    @NotNull(message = "The annime cannot be empty")
    @NotEmpty(message = "the anime cannot be null")
    private String name;
}
