package in.arpitgadle.first_proj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class IndexController {

    @GetMapping
    public String handleIndexRequest()
    {
        return "App is up and running @ "+ LocalDateTime.now();
    }
}
