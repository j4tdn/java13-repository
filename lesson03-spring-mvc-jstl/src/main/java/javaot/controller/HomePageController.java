package javaot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static javaot.common.Application.HOME_PAGE;

@Controller
public class HomePageController {
    @RequestMapping({"/", "/home"})
    public String showHomePage() {
        return HOME_PAGE;
    }
}
