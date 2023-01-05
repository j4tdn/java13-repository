package javaot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static javaot.common.Application.NAME_FORM_PAGE;
import static javaot.common.Application.NAME_INFO_PAGE;

@Controller
public class HelloWorldController {
    @GetMapping("hello")
    public String helloWorld() {
        return NAME_FORM_PAGE;
    }

    @PostMapping("process")
    public String processHello(@RequestParam("fullName") String content, Model model) {
        model.addAttribute("fullName", content);
        return NAME_INFO_PAGE;
    }
}
