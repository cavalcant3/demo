package academy.devdojo.controller;

import academy.devdojo.demo.Anime;
import academy.devdojo.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class AnimeController {
    @Autowired
    private DateUtil dateUtil;
    public List<Anime> list(){
        return List.of(new Anime("DBZ"), new Anime("DBZ@"));
    }
}
