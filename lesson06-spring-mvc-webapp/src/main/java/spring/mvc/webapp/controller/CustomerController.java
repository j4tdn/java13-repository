package spring.mvc.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.mvc.webapp.entity.Customer;
import spring.mvc.webapp.services.CustomerService;

import java.util.List;

import static common.Application.CUSTOMER_INDEX_PAGE;

@Controller
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public String index(Model model) {
        List<Customer> customerList = customerService.findAllCustomers();
        model.addAttribute("customers", customerList);
        return CUSTOMER_INDEX_PAGE;
    }
}
