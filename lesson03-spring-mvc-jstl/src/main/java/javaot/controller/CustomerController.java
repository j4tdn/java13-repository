package javaot.controller;

import javaot.bean.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController
{
    @GetMapping("customer")
    public String customerForm(){
        return "customer/customer-form";
    }
    @PostMapping("customer-process")
    public String customerProcess(
            @RequestParam String fullName,
            @RequestParam String lastName,
            @RequestParam Integer age,
            Model model
    ){
        Customer customer = new Customer(fullName, lastName, age);
        model.addAttribute("customer", customer);
        return "customer/customer";
    }
}
