package ca.enjoyit.mavenspringbootapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;

import java.time.Period;


@RestController
@Slf4j
@RequestMapping(path= "/v1/rest-api")
public class Controller {

    @Value("${period}")
    Period  period;

    @GetMapping
    public String getInfo() {
        return "Hello World! " + period.toTotalMonths();
        //Works: return "Hello World! " + Period.parse("p2Y").toTotalMonths();
    }
}
