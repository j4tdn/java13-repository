package spring.mvc.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static common.Application.HOMEPAGE;

@Controller
public class HomeController {


    @GetMapping
    public String welcome(Model model) {
        return HOMEPAGE;
    }
}
