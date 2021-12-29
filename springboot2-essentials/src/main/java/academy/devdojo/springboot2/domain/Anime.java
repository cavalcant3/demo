package academy.devdojo.springboot2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.Table;

@Data
@AllArgsConstructor

public class Anime {
    private Long id;
    private String name;

}