package spring.mvc.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static common.Application.STUFF_INDEX_PAGE;

@Controller
@RequestMapping("stuff")
public class StuffController {
    @GetMapping
    public String index() {
        return STUFF_INDEX_PAGE;
    }
}
