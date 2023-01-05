package javaot.controller;

import javaot.bean.Customer;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

import static javaot.common.Application.CUSTOMER_FORM_PAGE;
import static javaot.common.Application.CUSTOMER_INFO_PAGE;

@Controller
public class CustomerController {
    @InitBinder
    public void preHandler(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @GetMapping("customer")
    public String customerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return CUSTOMER_FORM_PAGE;
    }

    @PostMapping("customer-process")
    public String customerProcess(
            @Valid @ModelAttribute("customer") Customer customer,
            BindingResult bindingResult
    ) {
        System.out.println("bindingResult: " + bindingResult);
        System.out.println("\n\n");

        return bindingResult.hasErrors() ? CUSTOMER_FORM_PAGE : CUSTOMER_INFO_PAGE;
    }
}
