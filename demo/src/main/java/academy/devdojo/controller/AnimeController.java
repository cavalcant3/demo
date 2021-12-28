package academy.devdojo.controller;

import academy.devdojo.demo.Anime;
import academy.devdojo.util.DateUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("anime")
@Log4j2
public class AnimeController {
    
    private DateUtil dateUtil;

    public AnimeController(DateUtil dateUtil) {
        this.dateUtil = dateUtil;
    }

    public List<Anime> list(){
        log.info(dateUtil.formatLocalDateTimeToDataBaseStyle(LocalDateTime.now()));
        return List.of(new Anime("DBZ"), new Anime("DBZ@"));
    }
}
