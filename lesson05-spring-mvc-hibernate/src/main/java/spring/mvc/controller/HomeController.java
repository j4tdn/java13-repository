package spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import spring.mvc.services.CustomerService;
import spring.mvc.services.CustomerServiceImpl;

@Controller
public class HomeController {
    @Autowired
    private CustomerService customerService;
    @GetMapping
    public String welcome(){
        customerService.testConnection();
        return "home";

    }
}
