package spring.mvc.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static common.Application.ADMIN_INDEX_PAGE;

@Controller
@RequestMapping("admin")
public class AdminController {
    @GetMapping
    public String index() {
        return ADMIN_INDEX_PAGE;
    }
}
