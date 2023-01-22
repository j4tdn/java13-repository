package spring.mvc.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import spring.mvc.webapp.entity.Customer;
import spring.mvc.webapp.services.CustomerService;

import java.util.List;

import static common.Application.HOMEPAGE;

@Controller
public class HomeController {


    @GetMapping
    public String welcome(Model model) {
        return HOMEPAGE;
    }
}
