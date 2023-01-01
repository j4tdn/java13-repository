package javaot.controller;

import javaot.bean.Customer;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class CustomerController {
    @InitBinder
    public void preHandler(WebDataBinder webDataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }
    @GetMapping("customer")
    public String customerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer/customer-form";
    }

    @PostMapping("customer-process")
    public String customerProcess(
            @Valid @ModelAttribute("customer") Customer customer,
            BindingResult bindingResult
            ) {
        System.out.println("bindingResult: " + bindingResult);
        System.out.println("\n\n");

        return bindingResult.hasErrors() ? "customer/customer-form" : "customer/customer";
    }
}
