package spring.mvc.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import spring.mvc.webapp.entity.Customer;
import spring.mvc.webapp.services.CustomerService;

import javax.validation.Valid;
import java.util.List;

import static common.Application.*;
import static common.Message.*;

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

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("customer", new Customer());
        return CUSTOMER_FORM_PAGE;
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") Integer id, Model model) {
        model.addAttribute("customer", customerService.get(id));
        return CUSTOMER_FORM_PAGE;
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id, Model model) {
        try {
            customerService.delete(id);
        } catch (Exception ignored) {
            return CUSTOMER_REDIRECT_PAGE + MESSAGE_PARAM + DELETE_UNSUCCESSFUL;
        }
        return CUSTOMER_REDIRECT_PAGE + MESSAGE_PARAM + DELETE_SUCCESS;
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute Customer customer) {
        boolean isCreated = customer.getId() == null;
        try {
            customerService.save(customer);
        } catch (Exception ignored) {
            return CUSTOMER_REDIRECT_PAGE + MESSAGE_PARAM +
                    (isCreated ? ADD_UNSUCCESSFUL : UPDATE_UNSUCCESSFUL);
        }
        return CUSTOMER_REDIRECT_PAGE + MESSAGE_PARAM +
                (isCreated ? ADD_SUCCESS : UPDATE_SUCCESS);
    }
}
